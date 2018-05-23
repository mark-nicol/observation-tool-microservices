//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.AngleT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.AngularVelocityT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.FrequencyT;
import com.prototype.ot.microservices.projectservice.model.valuetypes.TimeT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Parameters for an holography SB. Presently this supports tower holography. There may be more to come in later holography modes. For tower holography this should not be attached to a target (there will be no targets in the SB)
 * 
 * <p>Java class for HolographyParametersT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HolographyParametersT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/SchedBlock}ObservingParametersT">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{Alma/ValueTypes}FrequencyT"/>
 *         &lt;element name="startFraction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="speed" type="{Alma/ValueTypes}AngularVelocityT"/>
 *         &lt;element name="rowsCal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calTime" type="{Alma/ValueTypes}TimeT"/>
 *         &lt;element name="nRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rowSize" type="{Alma/ValueTypes}AngleT"/>
 *         &lt;element name="uniDirectionalScan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="towerName" default="Holography_Tower_1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Holography_Tower_1"/>
 *             &lt;enumeration value="Astronomical_Target"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scanDirection" default="AzScan">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AzScan"/>
 *             &lt;enumeration value="ElScan"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="calMode" default="BORESIGHT">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FIVEPOINT"/>
 *             &lt;enumeration value="BORESIGHT"/>
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
@XmlType(name = "HolographyParametersT", propOrder = {
    "frequency",
    "startFraction",
    "speed",
    "rowsCal",
    "calTime",
    "nRows",
    "rowSize",
    "uniDirectionalScan"
})
public class HolographyParametersT
    extends ObservingParametersT
{

    @XmlElement(required = true)
    protected FrequencyT frequency;
    @XmlElement(defaultValue = "0.0")
    protected double startFraction;
    @XmlElement(required = true)
    protected AngularVelocityT speed;
    @XmlElement(defaultValue = "5")
    protected int rowsCal;
    @XmlElement(required = true)
    protected TimeT calTime;
    @XmlElement(defaultValue = "180")
    protected int nRows;
    @XmlElement(required = true)
    protected AngleT rowSize;
    @XmlElement(defaultValue = "false")
    protected boolean uniDirectionalScan;
    @XmlAttribute(name = "towerName")
    protected String towerName;
    @XmlAttribute(name = "scanDirection")
    protected String scanDirection;
    @XmlAttribute(name = "calMode")
    protected String calMode;

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyT }
     *     
     */
    public FrequencyT getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyT }
     *     
     */
    public void setFrequency(FrequencyT value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the startFraction property.
     * 
     */
    public double getStartFraction() {
        return startFraction;
    }

    /**
     * Sets the value of the startFraction property.
     * 
     */
    public void setStartFraction(double value) {
        this.startFraction = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link AngularVelocityT }
     *     
     */
    public AngularVelocityT getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngularVelocityT }
     *     
     */
    public void setSpeed(AngularVelocityT value) {
        this.speed = value;
    }

    /**
     * Gets the value of the rowsCal property.
     * 
     */
    public int getRowsCal() {
        return rowsCal;
    }

    /**
     * Sets the value of the rowsCal property.
     * 
     */
    public void setRowsCal(int value) {
        this.rowsCal = value;
    }

    /**
     * Gets the value of the calTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeT }
     *     
     */
    public TimeT getCalTime() {
        return calTime;
    }

    /**
     * Sets the value of the calTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeT }
     *     
     */
    public void setCalTime(TimeT value) {
        this.calTime = value;
    }

    /**
     * Gets the value of the nRows property.
     * 
     */
    public int getNRows() {
        return nRows;
    }

    /**
     * Sets the value of the nRows property.
     * 
     */
    public void setNRows(int value) {
        this.nRows = value;
    }

    /**
     * Gets the value of the rowSize property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getRowSize() {
        return rowSize;
    }

    /**
     * Sets the value of the rowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setRowSize(AngleT value) {
        this.rowSize = value;
    }

    /**
     * Gets the value of the uniDirectionalScan property.
     * 
     */
    public boolean isUniDirectionalScan() {
        return uniDirectionalScan;
    }

    /**
     * Sets the value of the uniDirectionalScan property.
     * 
     */
    public void setUniDirectionalScan(boolean value) {
        this.uniDirectionalScan = value;
    }

    /**
     * Gets the value of the towerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTowerName() {
        if (towerName == null) {
            return "Holography_Tower_1";
        } else {
            return towerName;
        }
    }

    /**
     * Sets the value of the towerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTowerName(String value) {
        this.towerName = value;
    }

    /**
     * Gets the value of the scanDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanDirection() {
        if (scanDirection == null) {
            return "AzScan";
        } else {
            return scanDirection;
        }
    }

    /**
     * Sets the value of the scanDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanDirection(String value) {
        this.scanDirection = value;
    }

    /**
     * Gets the value of the calMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalMode() {
        if (calMode == null) {
            return "BORESIGHT";
        } else {
            return calMode;
        }
    }

    /**
     * Sets the value of the calMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalMode(String value) {
        this.calMode = value;
    }

}
