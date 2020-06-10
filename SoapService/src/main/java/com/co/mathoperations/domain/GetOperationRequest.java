//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.10 a las 12:38:36 AM COT 
//


package com.co.mathoperations.domain;

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
    "numTwo",
    "operator"
})
@XmlRootElement(name = "getOperationRequest")
public class GetOperationRequest {

    @XmlElement(required = true)
    protected Double numOne;
    @XmlElement(required = true)
    protected Double numTwo;
    @XmlElement(required = true)
    protected String operator;

    /**
     * Obtiene el valor de la propiedad numOne.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumOne() {
        return numOne;
    }

    /**
     * Define el valor de la propiedad numOne.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumOne(Double value) {
        this.numOne = value;
    }

    /**
     * Obtiene el valor de la propiedad numTwo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumTwo() {
        return numTwo;
    }


    /**
     * Define el valor de la propiedad numTwo.
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setNumTwo(Double value) {
        this.numTwo = value;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad operator.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

}
