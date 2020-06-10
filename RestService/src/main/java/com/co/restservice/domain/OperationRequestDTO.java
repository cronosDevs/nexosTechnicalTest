package com.co.restservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperationRequestDTO {

    private Double numOne;
    private Double numTwo;
    private String operator;

}
