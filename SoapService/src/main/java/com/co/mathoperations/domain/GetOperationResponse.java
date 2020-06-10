//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.10 a las 12:38:36 AM COT 
//


package com.co.mathoperations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "result",
        "errorMessage"
})
@XmlRootElement(name = "getOperationResponse")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOperationResponse {

    @XmlElement(required = true)
    protected Double result;
    @XmlElement(required = true)
    protected String errorMessage;

    /**
     * Obtiene el valor de la propiedad result.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setResult(Double value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


}
