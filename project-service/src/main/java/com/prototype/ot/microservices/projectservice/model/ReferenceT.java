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
 * The reference coordinates ("off-source") to use in the case of single-dish observations.
 * 
 * <p>Java class for ReferenceT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceCoordinates" type="{Alma/ValueTypes}SkyCoordinatesT"/>
 *         &lt;element name="integrationTime" type="{Alma/ValueTypes}TimeT"/>
 *         &lt;element name="cycleTime" type="{Alma/ValueTypes}TimeT"/>
 *         &lt;element name="subScanDuration" type="{Alma/ValueTypes}TimeT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceT", propOrder = {
    "referenceCoordinates",
    "integrationTime",
    "cycleTime",
    "subScanDuration"
})
public class ReferenceT {

    @XmlElement(required = true)
    private SkyCoordinatesT referenceCoordinates;
    @XmlElement(required = true)
    private TimeT integrationTime;
    @XmlElement(required = true)
    private TimeT cycleTime;
    @XmlElement(required = true)
    private TimeT subScanDuration;

    /**
     * Gets the value of the referenceCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link SkyCoordinatesT }
     *     
     */
    public SkyCoordinatesT getReferenceCoordinates() {
        return referenceCoordinates;
    }

    /**
     * Sets the value of the referenceCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkyCoordinatesT }
     *     
     */
    public void setReferenceCoordinates(SkyCoordinatesT value) {
        this.referenceCoordinates = value;
    }

    /**
     * Gets the value of the integrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getIntegrationTime() {
        return integrationTime;
    }

    /**
     * Sets the value of the integrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setIntegrationTime(TimeT value) {
        this.integrationTime = value;
    }

    /**
     * Gets the value of the cycleTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getCycleTime() {
        return cycleTime;
    }

    /**
     * Sets the value of the cycleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setCycleTime(TimeT value) {
        this.cycleTime = value;
    }

    /**
     * Gets the value of the subScanDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getSubScanDuration() {
        return subScanDuration;
    }

    /**
     * Sets the value of the subScanDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setSubScanDuration(TimeT value) {
        this.subScanDuration = value;
    }

}
