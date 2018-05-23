//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.AngleT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.SensitivityT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.TemperatureT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains user-specified parameters that are to be used by the data processing pipeline to guide its execution. It should contain attributes that are not easily found in, or derived from, other elements in either the APDM or the ASDM. The items will typically be defaulted when the system view is determined from a science view, or may be user-input from the system view. The present version is a place holder!
 * 
 * <p>Java class for DataProcessingParametersT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProcessingParametersT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="angularResolution" type="{Alma/ValueTypes}AngleT"/>
 *         &lt;element name="velocityResolution" type="{Alma/ValueTypes}VelocityT"/>
 *         &lt;element name="tBSensitivityGoal" type="{Alma/ValueTypes}TemperatureT"/>
 *         &lt;element name="rMSGoal" type="{Alma/ValueTypes}SensitivityT"/>
 *       &lt;/sequence>
 *       &lt;attribute name="projectType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Continuum"/>
 *             &lt;enumeration value="Polarization"/>
 *             &lt;enumeration value="Other"/>
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
@XmlType(name = "DataProcessingParametersT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "angularResolution",
    "velocityResolution",
    "tbSensitivityGoal",
    "rmsGoal"
})
public class DataProcessingParametersT {

    @XmlElement(required = true)
    protected AngleT angularResolution;
    @XmlElement(required = true)
    protected VelocityT velocityResolution;
    @XmlElement(name = "tBSensitivityGoal", required = true)
    protected TemperatureT tbSensitivityGoal;
    @XmlElement(name = "rMSGoal", required = true)
    protected SensitivityT rmsGoal;
    @XmlAttribute(name = "projectType")
    protected String projectType;

    /**
     * Gets the value of the angularResolution property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getAngularResolution() {
        return angularResolution;
    }

    /**
     * Sets the value of the angularResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setAngularResolution(AngleT value) {
        this.angularResolution = value;
    }

    /**
     * Gets the value of the velocityResolution property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityT }
     *     
     */
    public VelocityT getVelocityResolution() {
        return velocityResolution;
    }

    /**
     * Sets the value of the velocityResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityT }
     *     
     */
    public void setVelocityResolution(VelocityT value) {
        this.velocityResolution = value;
    }

    /**
     * Gets the value of the tbSensitivityGoal property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureT }
     *     
     */
    public TemperatureT getTBSensitivityGoal() {
        return tbSensitivityGoal;
    }

    /**
     * Sets the value of the tbSensitivityGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureT }
     *     
     */
    public void setTBSensitivityGoal(TemperatureT value) {
        this.tbSensitivityGoal = value;
    }

    /**
     * Gets the value of the rmsGoal property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityT }
     *     
     */
    public SensitivityT getRMSGoal() {
        return rmsGoal;
    }

    /**
     * Sets the value of the rmsGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityT }
     *     
     */
    public void setRMSGoal(SensitivityT value) {
        this.rmsGoal = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectType(String value) {
        this.projectType = value;
    }

}
