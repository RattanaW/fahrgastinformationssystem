//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eBalises complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBalises">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balise" type="{http://www.railml.org/schemas/2009}tBalise" maxOccurs="unbounded"/>
 *         &lt;element name="baliseGroup" type="{http://www.railml.org/schemas/2009}eBaliseGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBalises", propOrder = {
    "balise",
    "baliseGroup"
})
public class EBalises {

    @XmlElement(required = true)
    protected List<TBalise> balise;
    protected List<EBaliseGroup> baliseGroup;

    /**
     * Gets the value of the balise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TBalise }
     * 
     * 
     */
    public List<TBalise> getBalise() {
        if (balise == null) {
            balise = new ArrayList<TBalise>();
        }
        return this.balise;
    }

    /**
     * Gets the value of the baliseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baliseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaliseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBaliseGroup }
     * 
     * 
     */
    public List<EBaliseGroup> getBaliseGroup() {
        if (baliseGroup == null) {
            baliseGroup = new ArrayList<EBaliseGroup>();
        }
        return this.baliseGroup;
    }

}
