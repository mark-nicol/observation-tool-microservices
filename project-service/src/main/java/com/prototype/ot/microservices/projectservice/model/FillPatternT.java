//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.22 at 04:31:38 PM BST 
//


package com.prototype.ot.microservices.projectservice.model;

import com.prototype.ot.microservices.projectservice.model.valuetypes.AngleT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FillPatternT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FillPatternT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/SchedBlock}FieldPatternT">
 *       &lt;sequence>
 *         &lt;element name="patternCenterCoordinates" type="{Alma/ValueTypes}SkyCoordinatesT"/>
 *         &lt;element name="longitudeLength" type="{Alma/ValueTypes}AngleT"/>
 *         &lt;element name="latitudeLength" type="{Alma/ValueTypes}AngleT"/>
 *         &lt;element name="samplingLength" type="{Alma/ValueTypes}AngleT"/>
 *         &lt;element name="orientation" type="{Alma/ValueTypes}AngleT"/>
 *       &lt;/sequence>
 *       &lt;attribute name="patternType" default="Auto">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Auto"/>
 *             &lt;enumeration value="Area"/>
 *             &lt;enumeration value="Centered"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="patternSubtype" default="Auto">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Auto"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scanningCoordinateSystem" default="horizon">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="J2000"/>
 *             &lt;enumeration value="ICRS"/>
 *             &lt;enumeration value="horizon"/>
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
@XmlType(name = "FillPatternT", propOrder = {
    "patternCenterCoordinates",
    "longitudeLength",
    "latitudeLength",
    "samplingLength",
    "orientation"
})
public class FillPatternT
    extends FieldPatternT
{

    @XmlElement(required = true)
    protected SkyCoordinatesT patternCenterCoordinates;
    @XmlElement(required = true)
    protected AngleT longitudeLength;
    @XmlElement(required = true)
    protected AngleT latitudeLength;
    @XmlElement(required = true)
    protected AngleT samplingLength;
    @XmlElement(required = true)
    protected AngleT orientation;
    @XmlAttribute(name = "patternType")
    protected String patternType;
    @XmlAttribute(name = "patternSubtype")
    protected String patternSubtype;
    @XmlAttribute(name = "scanningCoordinateSystem")
    protected String scanningCoordinateSystem;

    /**
     * Gets the value of the patternCenterCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link SkyCoordinatesT }
     *     
     */
    public SkyCoordinatesT getPatternCenterCoordinates() {
        return patternCenterCoordinates;
    }

    /**
     * Sets the value of the patternCenterCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkyCoordinatesT }
     *     
     */
    public void setPatternCenterCoordinates(SkyCoordinatesT value) {
        this.patternCenterCoordinates = value;
    }

    /**
     * Gets the value of the longitudeLength property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getLongitudeLength() {
        return longitudeLength;
    }

    /**
     * Sets the value of the longitudeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setLongitudeLength(AngleT value) {
        this.longitudeLength = value;
    }

    /**
     * Gets the value of the latitudeLength property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getLatitudeLength() {
        return latitudeLength;
    }

    /**
     * Sets the value of the latitudeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setLatitudeLength(AngleT value) {
        this.latitudeLength = value;
    }

    /**
     * Gets the value of the samplingLength property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getSamplingLength() {
        return samplingLength;
    }

    /**
     * Sets the value of the samplingLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setSamplingLength(AngleT value) {
        this.samplingLength = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link AngleT }
     *     
     */
    public AngleT getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleT }
     *     
     */
    public void setOrientation(AngleT value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the patternType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternType() {
        if (patternType == null) {
            return "Auto";
        } else {
            return patternType;
        }
    }

    /**
     * Sets the value of the patternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternType(String value) {
        this.patternType = value;
    }

    /**
     * Gets the value of the patternSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternSubtype() {
        if (patternSubtype == null) {
            return "Auto";
        } else {
            return patternSubtype;
        }
    }

    /**
     * Sets the value of the patternSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternSubtype(String value) {
        this.patternSubtype = value;
    }

    /**
     * Gets the value of the scanningCoordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanningCoordinateSystem() {
        if (scanningCoordinateSystem == null) {
            return "horizon";
        } else {
            return scanningCoordinateSystem;
        }
    }

    /**
     * Sets the value of the scanningCoordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanningCoordinateSystem(String value) {
        this.scanningCoordinateSystem = value;
    }

}
