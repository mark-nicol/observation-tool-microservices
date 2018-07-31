//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ObsProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObsProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObsProjectEntity" type="{Alma/ObsPrep/ObsProject}ObsProjectEntityT"/>
 *         &lt;element name="ObsProposalRef" type="{Alma/ObsPrep/ObsProposal}ObsProposalRefT"/>
 *         &lt;element name="ObsReviewRef" type="{Alma/ObsPrep/ObsReview}ObsReviewRefT" minOccurs="0"/>
 *         &lt;element name="ProjectStatusRef" type="{Alma/Scheduling/ProjectStatus}ProjectStatusRefT"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assignedPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeOfCreation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manualMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="simulationMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isCommissioning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isCalibration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="letterGrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scientificRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scientificScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="staffProjectNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taPhase2Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taMainComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consensusReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDDT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="p2gAttention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="p2gAttentionReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObsProgram" type="{Alma/ObsPrep/ObsProject}ObsProgramT"/>
 *         &lt;element name="SubmissionRecord" type="{Alma/ObsPrep/ObsProject}SubmissionRecordT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="13" />
 *       &lt;attribute name="revision" type="{http://www.w3.org/2001/XMLSchema}string" default="24" />
 *       &lt;attribute name="almatype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="APDM::ObsProject" />
 *       &lt;attribute name="status" default="NewPhase1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Approved"/>
 *             &lt;enumeration value="Broken"/>
 *             &lt;enumeration value="Canceled"/>
 *             &lt;enumeration value="Deleted"/>
 *             &lt;enumeration value="FullyObserved"/>
 *             &lt;enumeration value="PartiallyObserved"/>
 *             &lt;enumeration value="Phase2Submitted"/>
 *             &lt;enumeration value="PipelineError"/>
 *             &lt;enumeration value="Processed"/>
 *             &lt;enumeration value="Ready"/>
 *             &lt;enumeration value="Repaired"/>
 *             &lt;enumeration value="Running"/>
 *             &lt;enumeration value="ObservingTimedOut"/>
 *             &lt;enumeration value="ToBeRepaired"/>
 *             &lt;enumeration value="Verified"/>
 *             &lt;enumeration value="AnyState"/>
 *             &lt;enumeration value="Phase1Submitted"/>
 *             &lt;enumeration value="NewPhase1"/>
 *             &lt;enumeration value="NewPhase2"/>
 *             &lt;enumeration value="ObservingTerminated"/>
 *             &lt;enumeration value="ObservingAborted"/>
 *             &lt;enumeration value="ObservingFailed"/>
 *             &lt;enumeration value="VerificationFailure"/>
 *             &lt;enumeration value="Suspended"/>
 *             &lt;enumeration value="Rejected"/>
 *             &lt;enumeration value="CSVReady"/>
 *             &lt;enumeration value="CSVRunning"/>
 *             &lt;enumeration value="CSVSuspended"/>
 *             &lt;enumeration value="Completed"/>
 *             &lt;enumeration value="Delivered"/>
 *             &lt;enumeration value="InProgress"/>
 *             &lt;enumeration value="PipelineProcessing"/>
 *             &lt;enumeration value="ReadyForProcessing"/>
 *             &lt;enumeration value="ReadyToDeliver"/>
 *             &lt;enumeration value="CalibratorCheck"/>
 *             &lt;enumeration value="QA2InProgress"/>
 *             &lt;enumeration value="ManualProcessing"/>
 *             &lt;enumeration value="ReprocessingRequired"/>
 *             &lt;enumeration value="Waiting"/>
 *             &lt;enumeration value="QA3InProgress"/>
 *             &lt;enumeration value="PartiallyCompleted"/>
 *             &lt;enumeration value="NotObserved"/>
 *             &lt;enumeration value="ProcessingProblem"/>
 *             &lt;enumeration value="Processing"/>
 *             &lt;enumeration value="ReadyForReview"/>
 *             &lt;enumeration value="Reviewing"/>
 *             &lt;enumeration value="DeliveryInProgress"/>
 *             &lt;enumeration value="DoNotObserve"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObsProject", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "obsProjectEntity",
    "obsProposalRef",
    "obsReviewRef",
    "projectStatusRef",
    "projectName",
    "pi",
    "version",
    "code",
    "assignedPriority",
    "timeOfCreation",
    "manualMode",
    "simulationMode",
    "isCommissioning",
    "isCalibration",
    "letterGrade",
    "scientificRank",
    "scientificScore",
    "staffProjectNote",
    "taPhase2Comments",
    "taMainComments",
    "consensusReport",
    "isDDT",
    "p2GAttention",
    "p2GAttentionReasons",
    "obsProgram",
    "submissionRecord"
})
@XmlRootElement
public class ObsProject {

    @XmlElement(name = "ObsProjectEntity", required = true)
    private ObsProjectEntityT obsProjectEntity;
    @XmlElement(name = "ObsProposalRef", required = true)
    private ObsProposalRefT obsProposalRef;
    @XmlElement(name = "ObsReviewRef")
    private ObsReviewRefT obsReviewRef;
    @XmlElement(name = "ProjectStatusRef", required = true)
    private ProjectStatusRefT projectStatusRef;
    @XmlElement(required = true)
    private String projectName;
    @XmlElement(name = "pI", required = true)
    private String pi;
    @XmlElement(required = true, defaultValue = "0")
    private String version;
    @XmlElement(required = true, defaultValue = "None Assigned")
    private String code;
    @XmlElement(defaultValue = "0")
    private int assignedPriority;
    @XmlElement(required = true, defaultValue = "0000-00-00")
    private String timeOfCreation;
    @XmlElement(defaultValue = "false")
    private boolean manualMode;
    @XmlElement(defaultValue = "false")
    private boolean simulationMode;
    @XmlElement(defaultValue = "false")
    private boolean isCommissioning;
    @XmlElement(defaultValue = "false")
    private boolean isCalibration;
    @XmlElement(required = true, defaultValue = "D")
    private String letterGrade;
    @XmlElement(defaultValue = "1")
    private int scientificRank;
    @XmlElement(defaultValue = "1.0")
    private double scientificScore;
    @XmlElement(required = true)
    private String staffProjectNote;
    @XmlElement(required = true)
    private String taPhase2Comments;
    @XmlElement(required = true)
    private String taMainComments;
    @XmlElement(required = true)
    private String consensusReport;
    @XmlElement(defaultValue = "false")
    private Boolean isDDT;
    @XmlElement(name = "p2gAttention", defaultValue = "false")
    private Boolean p2GAttention;
    @XmlElement(name = "p2gAttentionReasons")
    private String p2GAttentionReasons;
    @XmlElement(name = "ObsProgram", required = true)
    private ObsProgramT obsProgram;
    @XmlElement(name = "SubmissionRecord")
    private List<SubmissionRecordT> submissionRecord;
    @XmlAttribute(name = "schemaVersion", required = true)
    private String schemaVersion;
    @XmlAttribute(name = "revision")
    private String revision;
    @XmlAttribute(name = "almatype", required = true)
    private String almatype;
    @XmlAttribute(name = "status")
    private String status;

    public ObsProject() {
        this.setPI("");
        this.setProjectName("");
        this.setVersion("0");
        this.setManualMode(false);
        this.setSimulationMode(false);
        this.setIsCalibration(false);
        this.setIsCommissioning(false);
        this.setObsProgram(new ObsProgramT());
        this.setObsProjectEntity(new ObsProjectEntityT());
    }

    public void setObsProposal(ObsProposal proposal) {
        this.setObsProposalRef(ObsProposalRefT.createFromProposal(proposal));
    }

    /**
     * Gets the value of the obsProjectEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ObsProjectEntityT }
     *     
     */
    public ObsProjectEntityT getObsProjectEntity() {
        return obsProjectEntity;
    }

    /**
     * Sets the value of the obsProjectEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObsProjectEntityT }
     *     
     */
    public void setObsProjectEntity(ObsProjectEntityT value) {
        this.obsProjectEntity = value;
    }

    /**
     * Gets the value of the obsProposalRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObsProposalRefT }
     *     
     */
    public ObsProposalRefT getObsProposalRef() {
        return obsProposalRef;
    }

    /**
     * Sets the value of the obsProposalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObsProposalRefT }
     *     
     */
    public void setObsProposalRef(ObsProposalRefT value) {
        this.obsProposalRef = value;
    }

    /**
     * Gets the value of the obsReviewRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObsReviewRefT }
     *     
     */
    public ObsReviewRefT getObsReviewRef() {
        return obsReviewRef;
    }

    /**
     * Sets the value of the obsReviewRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObsReviewRefT }
     *     
     */
    public void setObsReviewRef(ObsReviewRefT value) {
        this.obsReviewRef = value;
    }

    /**
     * Gets the value of the projectStatusRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectStatusRefT }
     *     
     */
    public ProjectStatusRefT getProjectStatusRef() {
        return projectStatusRef;
    }

    /**
     * Sets the value of the projectStatusRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectStatusRefT }
     *     
     */
    public void setProjectStatusRef(ProjectStatusRefT value) {
        this.projectStatusRef = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPI() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPI(String value) {
        this.pi = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the assignedPriority property.
     * 
     */
    public int getAssignedPriority() {
        return assignedPriority;
    }

    /**
     * Sets the value of the assignedPriority property.
     * 
     */
    public void setAssignedPriority(int value) {
        this.assignedPriority = value;
    }

    /**
     * Gets the value of the timeOfCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * Sets the value of the timeOfCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfCreation(String value) {
        this.timeOfCreation = value;
    }

    /**
     * Gets the value of the manualMode property.
     * 
     */
    public boolean isManualMode() {
        return manualMode;
    }

    /**
     * Sets the value of the manualMode property.
     * 
     */
    public void setManualMode(boolean value) {
        this.manualMode = value;
    }

    /**
     * Gets the value of the simulationMode property.
     * 
     */
    public boolean isSimulationMode() {
        return simulationMode;
    }

    /**
     * Sets the value of the simulationMode property.
     * 
     */
    public void setSimulationMode(boolean value) {
        this.simulationMode = value;
    }

    /**
     * Gets the value of the isCommissioning property.
     * 
     */
    public boolean isIsCommissioning() {
        return isCommissioning;
    }

    /**
     * Sets the value of the isCommissioning property.
     * 
     */
    public void setIsCommissioning(boolean value) {
        this.isCommissioning = value;
    }

    /**
     * Gets the value of the isCalibration property.
     * 
     */
    public boolean isIsCalibration() {
        return isCalibration;
    }

    /**
     * Sets the value of the isCalibration property.
     * 
     */
    public void setIsCalibration(boolean value) {
        this.isCalibration = value;
    }

    /**
     * Gets the value of the letterGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterGrade() {
        return letterGrade;
    }

    /**
     * Sets the value of the letterGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterGrade(String value) {
        this.letterGrade = value;
    }

    /**
     * Gets the value of the scientificRank property.
     * 
     */
    public int getScientificRank() {
        return scientificRank;
    }

    /**
     * Sets the value of the scientificRank property.
     * 
     */
    public void setScientificRank(int value) {
        this.scientificRank = value;
    }

    /**
     * Gets the value of the scientificScore property.
     * 
     */
    public double getScientificScore() {
        return scientificScore;
    }

    /**
     * Sets the value of the scientificScore property.
     * 
     */
    public void setScientificScore(double value) {
        this.scientificScore = value;
    }

    /**
     * Gets the value of the staffProjectNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffProjectNote() {
        return staffProjectNote;
    }

    /**
     * Sets the value of the staffProjectNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffProjectNote(String value) {
        this.staffProjectNote = value;
    }

    /**
     * Gets the value of the taPhase2Comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaPhase2Comments() {
        return taPhase2Comments;
    }

    /**
     * Sets the value of the taPhase2Comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaPhase2Comments(String value) {
        this.taPhase2Comments = value;
    }

    /**
     * Gets the value of the taMainComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaMainComments() {
        return taMainComments;
    }

    /**
     * Sets the value of the taMainComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaMainComments(String value) {
        this.taMainComments = value;
    }

    /**
     * Gets the value of the consensusReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsensusReport() {
        return consensusReport;
    }

    /**
     * Sets the value of the consensusReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsensusReport(String value) {
        this.consensusReport = value;
    }

    /**
     * Gets the value of the isDDT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDDT() {
        return isDDT;
    }

    /**
     * Sets the value of the isDDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDDT(Boolean value) {
        this.isDDT = value;
    }

    /**
     * Gets the value of the p2GAttention property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isP2GAttention() {
        return p2GAttention;
    }

    /**
     * Sets the value of the p2GAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setP2GAttention(Boolean value) {
        this.p2GAttention = value;
    }

    /**
     * Gets the value of the p2GAttentionReasons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2GAttentionReasons() {
        return p2GAttentionReasons;
    }

    /**
     * Sets the value of the p2GAttentionReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2GAttentionReasons(String value) {
        this.p2GAttentionReasons = value;
    }

    /**
     * Gets the value of the obsProgram property.
     * 
     * @return
     *     possible object is
     *     {@link ObsProgramT }
     *     
     */
    public ObsProgramT getObsProgram() {
        return obsProgram;
    }

    /**
     * Sets the value of the obsProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObsProgramT }
     *     
     */
    public void setObsProgram(ObsProgramT value) {
        this.obsProgram = value;
    }

    /**
     * Gets the value of the submissionRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submissionRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmissionRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmissionRecordT }
     * 
     * 
     */
    public List<SubmissionRecordT> getSubmissionRecord() {
        if (submissionRecord == null) {
            submissionRecord = new ArrayList<>();
        }
        return this.submissionRecord;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        if (schemaVersion == null) {
            return "13";
        } else {
            return schemaVersion;
        }
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        if (revision == null) {
            return "24";
        } else {
            return revision;
        }
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the almatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlmatype() {
        if (almatype == null) {
            return "APDM::ObsProject";
        } else {
            return almatype;
        }
    }

    /**
     * Sets the value of the almatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlmatype(String value) {
        this.almatype = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "NewPhase1";
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
