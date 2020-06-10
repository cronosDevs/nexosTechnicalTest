//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.10 a las 12:38:36 AM COT 
//


package com.technicaltest.web_service_soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOne" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numTwo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numOne",
    "numTwo"
})
@XmlRootElement(name = "getOperationRequest")
public class GetOperationRequest {

    @XmlElement(required = true)
    protected String numOne;
    @XmlElement(required = true)
    protected String numTwo;

    /**
     * Obtiene el valor de la propiedad numOne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOne() {
        return numOne;
    }

    /**
     * Define el valor de la propiedad numOne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOne(String value) {
        this.numOne = value;
    }

    /**
     * Obtiene el valor de la propiedad numTwo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTwo() {
        return numTwo;
    }

    /**
     * Define el valor de la propiedad numTwo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTwo(String value) {
        this.numTwo = value;
    }

}
