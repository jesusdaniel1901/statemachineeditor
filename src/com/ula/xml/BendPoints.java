//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.15 at 09:22:26 AM VET 
//


package com.ula.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="d1W" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="d1H" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="d2W" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="d2H" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bendPoints")
public class BendPoints {

    @XmlAttribute(required = true)
    protected int d1W;
    @XmlAttribute(required = true)
    protected int d1H;
    @XmlAttribute(required = true)
    protected int d2W;
    @XmlAttribute(required = true)
    protected int d2H;

    /**
     * Gets the value of the d1W property.
     * 
     */
    public int getD1W() {
        return d1W;
    }

    /**
     * Sets the value of the d1W property.
     * 
     */
    public void setD1W(int value) {
        this.d1W = value;
    }

    /**
     * Gets the value of the d1H property.
     * 
     */
    public int getD1H() {
        return d1H;
    }

    /**
     * Sets the value of the d1H property.
     * 
     */
    public void setD1H(int value) {
        this.d1H = value;
    }

    /**
     * Gets the value of the d2W property.
     * 
     */
    public int getD2W() {
        return d2W;
    }

    /**
     * Sets the value of the d2W property.
     * 
     */
    public void setD2W(int value) {
        this.d2W = value;
    }

    /**
     * Gets the value of the d2H property.
     * 
     */
    public int getD2H() {
        return d2H;
    }

    /**
     * Sets the value of the d2H property.
     * 
     */
    public void setD2H(int value) {
        this.d2H = value;
    }

}
