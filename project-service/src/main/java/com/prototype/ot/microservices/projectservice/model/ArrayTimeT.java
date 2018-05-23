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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayTimeT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayTimeT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimatedTime" type="{Alma/ValueTypes}TimeT"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arrayName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ACA"/>
 *             &lt;enumeration value="SEVEN-M"/>
 *             &lt;enumeration value="TP-Array"/>
 *             &lt;enumeration value="TWELVE-M"/>
 *             &lt;enumeration value="ALMA"/>
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
@XmlType(name = "ArrayTimeT", namespace = "Alma/ObsPrep/ObsProposal", propOrder = {
    "estimatedTime"
})
public class ArrayTimeT {

    @XmlElement(required = true)
    protected TimeT estimatedTime;
    @XmlAttribute(name = "arrayName")
    protected String arrayName;

    /**
     * Gets the value of the estimatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setEstimatedTime(TimeT value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the arrayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayName() {
        return arrayName;
    }

    /**
     * Sets the value of the arrayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayName(String value) {
        this.arrayName = value;
    }

}
