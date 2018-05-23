//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.SpeedT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VelocityT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VelocityT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centerVelocity" type="{Alma/ValueTypes}SpeedT"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referenceSystem" default="lsrk">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="bar"/>
 *             &lt;enumeration value="lsrk"/>
 *             &lt;enumeration value="topo"/>
 *             &lt;enumeration value="hel"/>
 *             &lt;enumeration value="lsr"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dopplerCalcType" default="OPTICAL">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RADIO"/>
 *             &lt;enumeration value="OPTICAL"/>
 *             &lt;enumeration value="RELATIVISTIC"/>
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
@XmlType(name = "VelocityT", namespace = "Alma/ValueTypes", propOrder = {
    "centerVelocity"
})
public class VelocityT {

    @XmlElement(required = true)
    protected SpeedT centerVelocity;
    @XmlAttribute(name = "referenceSystem")
    protected String referenceSystem;
    @XmlAttribute(name = "dopplerCalcType")
    protected String dopplerCalcType;

    /**
     * Gets the value of the centerVelocity property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedT }
     *     
     */
    public SpeedT getCenterVelocity() {
        return centerVelocity;
    }

    /**
     * Sets the value of the centerVelocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedT }
     *     
     */
    public void setCenterVelocity(SpeedT value) {
        this.centerVelocity = value;
    }

    /**
     * Gets the value of the referenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSystem() {
        if (referenceSystem == null) {
            return "lsrk";
        } else {
            return referenceSystem;
        }
    }

    /**
     * Sets the value of the referenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSystem(String value) {
        this.referenceSystem = value;
    }

    /**
     * Gets the value of the dopplerCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopplerCalcType() {
        if (dopplerCalcType == null) {
            return "OPTICAL";
        } else {
            return dopplerCalcType;
        }
    }

    /**
     * Sets the value of the dopplerCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopplerCalcType(String value) {
        this.dopplerCalcType = value;
    }

}
