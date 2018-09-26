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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies controls on an ObsUnit, which are a combination of controls provided by the user and the PRC. Since they are on ObsUnits they can be applied with very small granularity.
 * 
 * <p>Java class for ObsUnitControlT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObsUnitControlT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/ObsProject}ControlBlockT">
 *       &lt;sequence>
 *         &lt;element name="CalibrationRequirements" type="{Alma/ObsPrep/ObsProject}CalibrationRequirementsT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObsUnitControlT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "calibrationRequirements"
})
public class ObsUnitControlT
    extends ControlBlockT
{

    @XmlElement(name = "CalibrationRequirements", required = true)
    private CalibrationRequirementsT calibrationRequirements;

    /**
     * Gets the value of the calibrationRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link CalibrationRequirementsT }
     *     
     */
    public CalibrationRequirementsT getCalibrationRequirements() {
        return calibrationRequirements;
    }

    /**
     * Sets the value of the calibrationRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalibrationRequirementsT }
     *     
     */
    public void setCalibrationRequirements(CalibrationRequirementsT value) {
        this.calibrationRequirements = value;
    }

}
