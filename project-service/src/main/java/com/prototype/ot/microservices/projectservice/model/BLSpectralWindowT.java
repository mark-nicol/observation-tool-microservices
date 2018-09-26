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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Concrete spectral window for the baseline correlator. 1..64 may be created.
 * 
 * <p>Java class for BLSpectralWindowT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BLSpectralWindowT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/SchedBlock}AbstractSpectralWindowT">
 *       &lt;sequence>
 *         &lt;element name="correlationNyquistOversampling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="quantizationCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ChannelAverageRegion" type="{Alma/ObsPrep/SchedBlock}ChannelAverageRegionT" maxOccurs="32"/>
 *       &lt;/sequence>
 *       &lt;attribute name="correlationBits" default="BITS_2x2">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BITS_2x2"/>
 *             &lt;enumeration value="BITS_3x3"/>
 *             &lt;enumeration value="BITS_4x4"/>
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
@XmlType(name = "BLSpectralWindowT", propOrder = {
    "correlationNyquistOversampling",
    "quantizationCorrection",
    "channelAverageRegion"
})
public class BLSpectralWindowT
    extends AbstractSpectralWindowT
{

    @XmlElement(defaultValue = "true")
    private boolean correlationNyquistOversampling;
    @XmlElement(defaultValue = "true")
    private boolean quantizationCorrection;
    @XmlElement(name = "ChannelAverageRegion", required = true)
    private List<ChannelAverageRegionT> channelAverageRegion;
    @XmlAttribute(name = "correlationBits")
    private String correlationBits;

    /**
     * Gets the value of the correlationNyquistOversampling property.
     * 
     */
    public boolean isCorrelationNyquistOversampling() {
        return correlationNyquistOversampling;
    }

    /**
     * Sets the value of the correlationNyquistOversampling property.
     * 
     */
    public void setCorrelationNyquistOversampling(boolean value) {
        this.correlationNyquistOversampling = value;
    }

    /**
     * Gets the value of the quantizationCorrection property.
     * 
     */
    public boolean isQuantizationCorrection() {
        return quantizationCorrection;
    }

    /**
     * Sets the value of the quantizationCorrection property.
     * 
     */
    public void setQuantizationCorrection(boolean value) {
        this.quantizationCorrection = value;
    }

    /**
     * Gets the value of the channelAverageRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelAverageRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelAverageRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelAverageRegionT }
     * 
     * 
     */
    public List<ChannelAverageRegionT> getChannelAverageRegion() {
        if (channelAverageRegion == null) {
            channelAverageRegion = new ArrayList<>();
        }
        return this.channelAverageRegion;
    }

    /**
     * Gets the value of the correlationBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationBits() {
        if (correlationBits == null) {
            return "BITS_2x2";
        } else {
            return correlationBits;
        }
    }

    /**
     * Sets the value of the correlationBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationBits(String value) {
        this.correlationBits = value;
    }

}
