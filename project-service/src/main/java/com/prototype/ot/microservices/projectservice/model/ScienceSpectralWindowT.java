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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Science oriented definition of a spectral window.
 * 
 * <p>Java class for ScienceSpectralWindowT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScienceSpectralWindowT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/ObsProject}AbstractScienceSpectralWindowT">
 *       &lt;sequence>
 *         &lt;element name="transitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centerFrequency" type="{Alma/ValueTypes}FrequencyT"/>
 *         &lt;element name="bandWidth" type="{Alma/ValueTypes}UserFrequencyT"/>
 *         &lt;element name="spectralResolution" type="{Alma/ValueTypes}UserFrequencyT"/>
 *         &lt;element name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isSkyFrequency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="splatalogId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="representativeWindow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="groupResourceUse">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FULL"/>
 *             &lt;enumeration value="HALF"/>
 *             &lt;enumeration value="QUARTER"/>
 *             &lt;enumeration value="EIGHTH"/>
 *             &lt;enumeration value="SIXTEENTH"/>
 *             &lt;enumeration value="THIRTYSECOND"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScienceSpectralWindowT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "transitionName",
    "centerFrequency",
    "bandWidth",
    "spectralResolution",
    "groupIndex",
    "isSkyFrequency",
    "splatalogId",
    "representativeWindow"
})
public class ScienceSpectralWindowT
    extends AbstractScienceSpectralWindowT
{

    @XmlElement(required = true)
    private String transitionName;
    @XmlElement(required = true)
    private FrequencyT centerFrequency;
    @XmlElement(required = true)
    private UserFrequencyT bandWidth;
    @XmlElement(required = true)
    private UserFrequencyT spectralResolution;
    private int groupIndex;
    @XmlElement(defaultValue = "false")
    private boolean isSkyFrequency;
    private Integer splatalogId;
    @XmlElement(defaultValue = "false")
    private boolean representativeWindow;
    @XmlAttribute(name = "groupResourceUse")
    private String groupResourceUse;

    /**
     * Gets the value of the transitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionName() {
        return transitionName;
    }

    /**
     * Sets the value of the transitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionName(String value) {
        this.transitionName = value;
    }

    /**
     * Gets the value of the centerFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyT }
     *     
     */
    public FrequencyT getCenterFrequency() {
        return centerFrequency;
    }

    /**
     * Sets the value of the centerFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyT }
     *     
     */
    public void setCenterFrequency(FrequencyT value) {
        this.centerFrequency = value;
    }

    /**
     * Gets the value of the bandWidth property.
     * 
     * @return
     *     possible object is
     *     {@link UserFrequencyT }
     *     
     */
    public UserFrequencyT getBandWidth() {
        return bandWidth;
    }

    /**
     * Sets the value of the bandWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFrequencyT }
     *     
     */
    public void setBandWidth(UserFrequencyT value) {
        this.bandWidth = value;
    }

    /**
     * Gets the value of the spectralResolution property.
     * 
     * @return
     *     possible object is
     *     {@link UserFrequencyT }
     *     
     */
    public UserFrequencyT getSpectralResolution() {
        return spectralResolution;
    }

    /**
     * Sets the value of the spectralResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFrequencyT }
     *     
     */
    public void setSpectralResolution(UserFrequencyT value) {
        this.spectralResolution = value;
    }

    /**
     * Gets the value of the groupIndex property.
     * 
     */
    public int getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     */
    public void setGroupIndex(int value) {
        this.groupIndex = value;
    }

    /**
     * Gets the value of the isSkyFrequency property.
     * 
     */
    public boolean isIsSkyFrequency() {
        return isSkyFrequency;
    }

    /**
     * Sets the value of the isSkyFrequency property.
     * 
     */
    public void setIsSkyFrequency(boolean value) {
        this.isSkyFrequency = value;
    }

    /**
     * Gets the value of the splatalogId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplatalogId() {
        return splatalogId;
    }

    /**
     * Sets the value of the splatalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplatalogId(Integer value) {
        this.splatalogId = value;
    }

    /**
     * Gets the value of the representativeWindow property.
     * 
     */
    public boolean isRepresentativeWindow() {
        return representativeWindow;
    }

    /**
     * Sets the value of the representativeWindow property.
     * 
     */
    public void setRepresentativeWindow(boolean value) {
        this.representativeWindow = value;
    }

    /**
     * Gets the value of the groupResourceUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupResourceUse() {
        return groupResourceUse;
    }

    /**
     * Sets the value of the groupResourceUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupResourceUse(String value) {
        this.groupResourceUse = value;
    }

}
