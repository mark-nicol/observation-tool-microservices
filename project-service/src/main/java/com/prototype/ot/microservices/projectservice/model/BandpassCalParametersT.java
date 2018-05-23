//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.AngleT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.TimeT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Attaching this indicates that the target can be used for bandpass calibrations.
 * 
 * <p>Java class for BandpassCalParametersT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BandpassCalParametersT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/SchedBlock}CalibratorParametersT">
 *       &lt;sequence>
 *         &lt;element name="desiredAmplitudeAccuracy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximumElapsedTime" type="{Alma/ValueTypes}TimeT"/>
 *         &lt;element name="desiredPhaseAccuracy" type="{Alma/ValueTypes}AngleT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BandpassCalParametersT", propOrder = {
    "desiredAmplitudeAccuracy",
    "maximumElapsedTime",
    "desiredPhaseAccuracy"
})
public class BandpassCalParametersT
    extends CalibratorParametersT
{

    @XmlElement(defaultValue = "5")
    protected double desiredAmplitudeAccuracy;
    @XmlElement(required = true)
    protected TimeT maximumElapsedTime;
    @XmlElement(required = true)
    protected AngleT desiredPhaseAccuracy;

    /**
     * Gets the value of the desiredAmplitudeAccuracy property.
     * 
     */
    public double getDesiredAmplitudeAccuracy() {
        return desiredAmplitudeAccuracy;
    }

    /**
     * Sets the value of the desiredAmplitudeAccuracy property.
     * 
     */
    public void setDesiredAmplitudeAccuracy(double value) {
        this.desiredAmplitudeAccuracy = value;
    }

    /**
     * Gets the value of the maximumElapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getMaximumElapsedTime() {
        return maximumElapsedTime;
    }

    /**
     * Sets the value of the maximumElapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setMaximumElapsedTime(TimeT value) {
        this.maximumElapsedTime = value;
    }

    /**
     * Gets the value of the desiredPhaseAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getDesiredPhaseAccuracy() {
        return desiredPhaseAccuracy;
    }

    /**
     * Sets the value of the desiredPhaseAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setDesiredPhaseAccuracy(AngleT value) {
        this.desiredPhaseAccuracy = value;
    }

}
