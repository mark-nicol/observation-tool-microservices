//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.TimeT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Any specific timing requirements for the observing
 * 
 * <p>Java class for AbstractTimingConstraintsT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimingConstraintsT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowedMargin" type="{Alma/ValueTypes}TimeT" minOccurs="0"/>
 *         &lt;element name="repeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lSTMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lSTMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAvoidConstraint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isFixedStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimingConstraintsT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "startTime",
    "endTime",
    "allowedMargin",
    "repeats",
    "lstMin",
    "lstMax",
    "note",
    "isAvoidConstraint",
    "priority",
    "isFixedStart"
})
@XmlSeeAlso({
    MonitoringConstraintT.class,
    TemporalParametersT.class,
    VisitConstraintT.class
})
public abstract class AbstractTimingConstraintsT {

    protected String startTime;
    protected String endTime;
    protected TimeT allowedMargin;
    protected Integer repeats;
    @XmlElement(name = "lSTMin")
    protected String lstMin;
    @XmlElement(name = "lSTMax")
    protected String lstMax;
    protected String note;
    @XmlElement(defaultValue = "false")
    protected Boolean isAvoidConstraint;
    @XmlElement(defaultValue = "0")
    protected Integer priority;
    @XmlElement(defaultValue = "false")
    protected Boolean isFixedStart;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the allowedMargin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getAllowedMargin() {
        return allowedMargin;
    }

    /**
     * Sets the value of the allowedMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setAllowedMargin(TimeT value) {
        this.allowedMargin = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeats() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeats(Integer value) {
        this.repeats = value;
    }

    /**
     * Gets the value of the lstMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTMin() {
        return lstMin;
    }

    /**
     * Sets the value of the lstMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTMin(String value) {
        this.lstMin = value;
    }

    /**
     * Gets the value of the lstMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTMax() {
        return lstMax;
    }

    /**
     * Sets the value of the lstMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTMax(String value) {
        this.lstMax = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the isAvoidConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvoidConstraint() {
        return isAvoidConstraint;
    }

    /**
     * Sets the value of the isAvoidConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvoidConstraint(Boolean value) {
        this.isAvoidConstraint = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the isFixedStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFixedStart() {
        return isFixedStart;
    }

    /**
     * Sets the value of the isFixedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFixedStart(Boolean value) {
        this.isFixedStart = value;
    }

}
