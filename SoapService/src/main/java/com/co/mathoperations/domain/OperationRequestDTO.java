package com.co.mathoperations.domain;

import lombok.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "num1",
        "num2"
})
@XmlRootElement(name = "operationRequestDTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OperationRequestDTO {

    @XmlElement(required = true)
    protected Double num1;

    @XmlElement(required = true)
    protected Double num2;

}
