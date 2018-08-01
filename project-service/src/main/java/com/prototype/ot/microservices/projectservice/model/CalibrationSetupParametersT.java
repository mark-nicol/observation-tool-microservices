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
 * The, science oriented, calibration setup parameters required. For the moment this is a placeholder until we get a better understanding of what is needed.
 * 
 * <p>Java class for CalibrationSetupParametersT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalibrationSetupParametersT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalibrationTargetParameters" type="{Alma/ObsPrep/ObsProject}CalibrationTargetParametersT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="selection">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="user"/>
 *             &lt;enumeration value="system"/>
 *             &lt;enumeration value="systemAlternate"/>
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
@XmlType(name = "CalibrationSetupParametersT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "calibrationTargetParameters"
})
public class CalibrationSetupParametersT {

    @XmlElement(name = "CalibrationTargetParameters")
    private List<CalibrationTargetParametersT> calibrationTargetParameters;
    @XmlAttribute(name = "selection")
    private String selection;

    /**
     * Gets the value of the calibrationTargetParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calibrationTargetParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalibrationTargetParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalibrationTargetParametersT }
     * 
     * 
     */
    public List<CalibrationTargetParametersT> getCalibrationTargetParameters() {
        if (calibrationTargetParameters == null) {
            calibrationTargetParameters = new ArrayList<>();
        }
        return this.calibrationTargetParameters;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

}