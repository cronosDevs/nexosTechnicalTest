package com.co.restservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormulaDTO {
    //Formula de la pendiente
    private Double y2;
    private Double y1;
    private Double x1;
    private Double x2;

    //Formula del promedio
    private List<Double> avgNumbers;

    //area de un triangulo
    private Double base;
    private Double altura;

    //area de un circulo
    private Double radio;

}
