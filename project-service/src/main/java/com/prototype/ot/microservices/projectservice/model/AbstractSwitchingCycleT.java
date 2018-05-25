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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for defining switching cycles.
 * 
 * <p>Java class for AbstractSwitchingCycleT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSwitchingCycleT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPositions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dwellTime" type="{Alma/ValueTypes}TimeT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSwitchingCycleT", propOrder = {
    "numberOfPositions",
    "dwellTime"
})
@XmlSeeAlso({
    FrequencySwitchingCycleT.class,
    BeamSwitchingCycleT.class
})
public abstract class AbstractSwitchingCycleT {

    private int numberOfPositions;
    @XmlElement(required = true)
    private TimeT dwellTime;

    /**
     * Gets the value of the numberOfPositions property.
     * 
     */
    public int getNumberOfPositions() {
        return numberOfPositions;
    }

    /**
     * Sets the value of the numberOfPositions property.
     * 
     */
    public void setNumberOfPositions(int value) {
        this.numberOfPositions = value;
    }

    /**
     * Gets the value of the dwellTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getDwellTime() {
        return dwellTime;
    }

    /**
     * Sets the value of the dwellTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setDwellTime(TimeT value) {
        this.dwellTime = value;
    }

}
