package com.prototype.ot.microservices.projectservice.services;

import com.google.gson.Gson;
import com.prototype.ot.microservices.projectservice.model.project.ObsProject;
import com.prototype.ot.microservices.projectservice.model.project.ObsProposal;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjectService {

    private Gson gson;

    public ProjectService() {
        this.gson = new Gson();
    }

    public List<ObsProject> getAllProjects() throws IOException {
        ClassLoader cl = this.getClass().getClassLoader();
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver(cl);
        Resource[] resources = resourcePatternResolver.getResources("classpath*:/projects/real-projects/*.aot");
        List<ObsProject> projects = new ArrayList<>();
        ZipUtils.ZipReader zipReader = null;
        JSONObject json;
        String xml;
        ZipUtils.ZipNtry entry;
        byte[] data;
        for (Resource f : resources) {
            zipReader = new ZipUtils.ZipReader(f.getInputStream());
            entry = zipReader.getZipEntry();
            while (!entry.toString().equals("ObsProject.xml")) {
                entry = zipReader.getZipEntry();
            }
            data = entry.getData();
            xml = new String(data, StandardCharsets.UTF_8);
            json = XML.toJSONObject(xml);
            json = switchColons(json);
            projects.add(gson.fromJson(json.getJSONObject("prj_ObsProject").toString(), ObsProject.class));
        }
        return projects;
    }

    public ObsProject getProject(String projectRef) throws IOException {
        List<ObsProject> projects = this.getAllProjects();
        for (ObsProject project : projects) {
            if (project.getPrj_ObsProjectEntity().getEntityId().equals(projectRef)) {
                return project;
            }
        }
        return null;
    }

    public List<ObsProposal> getAllProposals() throws IOException {
        List<ObsProposal> proposals = new ArrayList<>();
        ClassLoader cl = this.getClass().getClassLoader();
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver(cl);
        Resource[] resources = resourcePatternResolver.getResources("classpath*:/projects/real-projects/*.aot");
        ZipUtils.ZipReader zipReader = null;
        JSONObject json;
        String xml;
        ZipUtils.ZipNtry entry;
        byte[] data;
        for (Resource f : resources) {
            zipReader = new ZipUtils.ZipReader(f.getInputStream());
            entry = zipReader.getZipEntry();
            while (!entry.toString().equals("ObsProposal.xml")) {
                entry = zipReader.getZipEntry();
            }
            data = entry.getData();
            xml = new String(data, StandardCharsets.UTF_8);
            json = XML.toJSONObject(xml);
            json = switchColons(json);
            proposals.add(gson.fromJson(json.getJSONObject("prp_ObsProposal").toString(), ObsProposal.class));
        }
        return proposals;
    }

    public ObsProposal getProposal(String proposalRef) throws IOException {
        List<ObsProposal> proposals = this.getAllProposals();
        for (ObsProposal obsProposal : proposals) {
            if (obsProposal.getPrp_ObsProposalEntity().getEntityId().equals(proposalRef)) {
                return obsProposal;
            }
        }
        return null;
    }

    public void updateProposal(ObsProposal proposal) {
        System.out.println("ProjectService, updateProposal");
        JSONObject object = new JSONObject(proposal);
        String xml = XML.toString(object);
        System.out.println(xml);
    }

    public ObsProject updateProject(String projectCode, ObsProject project) {
        return null;
    }

    public ObsProject createProject(ObsProject project) {
        return project;
    }

    public void deleteProject(String projectCode) {

    }

    private String stripTags(String raw) {
        return raw
                .replace("prj:", "")
                .replace("prp:", "")
                .replace("val:", "");
    }

    private static JSONObject switchColons(JSONObject original) {
        JSONObject toReturn = new JSONObject();
        Iterator<String> keys = original.keys();
        while (keys.hasNext()) {
            String oldKey = keys.next();
            String newKey = oldKey.replace(':', '_');
            if (original.get(oldKey) instanceof JSONObject) {
                toReturn.put(newKey, switchColons(original.getJSONObject(oldKey)));
            } else if (original.get(oldKey) instanceof JSONArray) {
                toReturn.put(newKey, switchColonsArray(original.getJSONArray(oldKey)));
            } else {
                toReturn.put(newKey, original.get(oldKey));
            }
        }
        return toReturn;
    }

    private static JSONArray switchColonsArray(JSONArray array) {
        JSONArray toReturn = new JSONArray();
        for (int i = 0; i < array.length(); i++) {
            if (array.get(i) instanceof JSONObject) {
                toReturn.put(switchColons(array.getJSONObject(i)));
            } else {
                toReturn.put(array.get(i));
            }
        }
        return toReturn;
    }

}
