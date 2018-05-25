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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Specialises the basic target setup by defining the type of mapping.
 * 
 * <p>Java class for TargetParametersT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetParametersT">
 *   &lt;complexContent>
 *     &lt;extension base="{Alma/ObsPrep/ObsProject}AbstractTargetParametersT">
 *       &lt;sequence>
 *         &lt;element name="isMosaic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Circle" type="{Alma/ObsPrep/ObsProject}CircleT"/>
 *           &lt;element name="Ellipse" type="{Alma/ObsPrep/ObsProject}EllipseT"/>
 *           &lt;element name="Polygon" type="{Alma/ObsPrep/ObsProject}PolygonT"/>
 *           &lt;element name="Rectangle" type="{Alma/ObsPrep/ObsProject}RectangleT"/>
 *           &lt;element name="SinglePoint" type="{Alma/ObsPrep/ObsProject}SinglePointT"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="F_MultiplePoints"/>
 *             &lt;enumeration value="F_SingleRectangle"/>
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
@XmlType(name = "TargetParametersT", namespace = "Alma/ObsPrep/ObsProject", propOrder = {
    "isMosaic",
        "fields"
})
public class TargetParametersT
    extends AbstractTargetParametersT
{

    @XmlElement(defaultValue = "false")
    private Boolean isMosaic;
    @XmlElements({
        @XmlElement(name = "Circle", type = CircleT.class),
        @XmlElement(name = "Ellipse", type = EllipseT.class),
        @XmlElement(name = "Polygon", type = PolygonT.class),
        @XmlElement(name = "Rectangle", type = RectangleT.class),
        @XmlElement(name = "SinglePoint", type = SinglePointT.class)
    })
    private List<FieldT> fields;
    @XmlAttribute(name = "type")
    private String type;

    /**
     * Gets the value of the isMosaic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMosaic() {
        return isMosaic;
    }

    /**
     * Sets the value of the isMosaic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMosaic(Boolean value) {
        this.isMosaic = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CircleT }
     * {@link EllipseT }
     * {@link PolygonT }
     * {@link RectangleT }
     * {@link SinglePointT }
     * 
     * 
     */
    public List<FieldT> getFields() {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
