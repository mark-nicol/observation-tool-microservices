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
 * <p>Java class for TechnicalJustificationT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalJustificationT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="justificationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="justificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalJustificationT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "justificationText",
    "justificationKey"
})
public class TechnicalJustificationT {

    @XmlElement(required = true)
    private String justificationText;
    private String justificationKey;

    /**
     * Gets the value of the justificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationText() {
        return justificationText;
    }

    /**
     * Sets the value of the justificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationText(String value) {
        this.justificationText = value;
    }

    /**
     * Gets the value of the justificationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationKey() {
        return justificationKey;
    }

    /**
     * Sets the value of the justificationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationKey(String value) {
        this.justificationKey = value;
    }

}
