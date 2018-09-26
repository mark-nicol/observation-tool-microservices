/*
 * ALMA - Atacama Large Millimeter Array
 * Copyright (c) UKATC - UK Astronomy Technology Centre, Science and Technology Facilities Council, 2018
 * (in the framework of the ALMA collaboration).
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A specialised "Science Goal" designed to capture the information necessary to construct an Optical Pointing run SB
 * 
 * <p>Java class for OpticalPointingScienceGoalT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpticalPointingScienceGoalT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/ObsProject}AbstractScienceGoalT">
 *       &lt;sequence>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedBlockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opticalCameraControl" type="{Alma/ObsPrep/ObsProject}OpticalCameraControlParametersT"/>
 *         &lt;element name="opticalCameraSpec" type="{Alma/ObsPrep/ObsProject}OpticalCameraSpecParametersT"/>
 *         &lt;element name="OpticalPointingTargetParameters" type="{Alma/ObsPrep/ObsProject}OpticalPointingTargetParametersT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpticalPointingTargetQueryParameters" type="{Alma/ObsPrep/ObsProject}OpticalPointingTargetQueryParametersT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpticalPointingScienceGoalT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "filename",
    "schedBlockName",
    "opticalCameraControl",
    "opticalCameraSpec",
    "opticalPointingTargetParameters",
    "opticalPointingTargetQueryParameters"
})
public class OpticalPointingScienceGoalT
    extends AbstractScienceGoalT
{

    @XmlElement(required = true)
    private String filename;
    @XmlElement(required = true)
    private String schedBlockName;
    @XmlElement(required = true)
    private OpticalCameraControlParametersT opticalCameraControl;
    @XmlElement(required = true)
    private OpticalCameraSpecParametersT opticalCameraSpec;
    @XmlElement(name = "OpticalPointingTargetParameters")
    private List<OpticalPointingTargetParametersT> opticalPointingTargetParameters;
    @XmlElement(name = "OpticalPointingTargetQueryParameters", required = true)
    private OpticalPointingTargetQueryParametersT opticalPointingTargetQueryParameters;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the schedBlockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedBlockName() {
        return schedBlockName;
    }

    /**
     * Sets the value of the schedBlockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedBlockName(String value) {
        this.schedBlockName = value;
    }

    /**
     * Gets the value of the opticalCameraControl property.
     * 
     * @return
     *     possible object is
     *     {@link OpticalCameraControlParametersT }
     *     
     */
    public OpticalCameraControlParametersT getOpticalCameraControl() {
        return opticalCameraControl;
    }

    /**
     * Sets the value of the opticalCameraControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalCameraControlParametersT }
     *     
     */
    public void setOpticalCameraControl(OpticalCameraControlParametersT value) {
        this.opticalCameraControl = value;
    }

    /**
     * Gets the value of the opticalCameraSpec property.
     * 
     * @return
     *     possible object is
     *     {@link OpticalCameraSpecParametersT }
     *     
     */
    public OpticalCameraSpecParametersT getOpticalCameraSpec() {
        return opticalCameraSpec;
    }

    /**
     * Sets the value of the opticalCameraSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalCameraSpecParametersT }
     *     
     */
    public void setOpticalCameraSpec(OpticalCameraSpecParametersT value) {
        this.opticalCameraSpec = value;
    }

    /**
     * Gets the value of the opticalPointingTargetParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opticalPointingTargetParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpticalPointingTargetParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpticalPointingTargetParametersT }
     * 
     * 
     */
    public List<OpticalPointingTargetParametersT> getOpticalPointingTargetParameters() {
        if (opticalPointingTargetParameters == null) {
            opticalPointingTargetParameters = new ArrayList<>();
        }
        return this.opticalPointingTargetParameters;
    }

    /**
     * Gets the value of the opticalPointingTargetQueryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OpticalPointingTargetQueryParametersT }
     *     
     */
    public OpticalPointingTargetQueryParametersT getOpticalPointingTargetQueryParameters() {
        return opticalPointingTargetQueryParameters;
    }

    /**
     * Sets the value of the opticalPointingTargetQueryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalPointingTargetQueryParametersT }
     *     
     */
    public void setOpticalPointingTargetQueryParameters(OpticalPointingTargetQueryParametersT value) {
        this.opticalPointingTargetQueryParameters = value;
    }

}
