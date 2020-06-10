package com.co.mathoperations.domain;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
public class OperationResponseDTO {
}
