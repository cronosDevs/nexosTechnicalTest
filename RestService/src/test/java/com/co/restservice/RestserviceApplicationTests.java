package com.co.restservice;

import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.utils.ValidationFields;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RestserviceApplicationTests {

    @Test
    public void validateOperationFields() throws ValidationException {
        OperationRequestDTO operationRequestDTO = OperationRequestDTO.builder()
                .numOne(5.0)
                .numTwo(5.0)
                .operator("add")
                .build();
        ValidationFields.validateOperationFields(operationRequestDTO);
    }

    @Test
    public void validateFormulaPendienteFields() throws ValidationException {
        FormulaDTO formulaDTO = FormulaDTO.builder()
                .y2(5.0)
                .y1(5.0)
                .x2(5.0)
                .x1(5.0)
                .build();
        ValidationFields.validateFormulaPendienteFields(formulaDTO);
    }

    @Test
    public void validateFormulaPromedio() throws ValidationException {
        List<Double> avgNumbers = new ArrayList<>();
        avgNumbers.add(5.0);
        FormulaDTO formulaDTO = FormulaDTO.builder()
                .avgNumbers(avgNumbers)
                .build();
        ValidationFields.validateFormulaPromedio(formulaDTO);
    }

    @Test
    public void validateFormulaAreaTriangulo() throws ValidationException {
        FormulaDTO formulaDTO = FormulaDTO.builder()
                .base(5.0)
                .altura(5.0)
                .build();
        ValidationFields.validateFormulaAreaTriangulo(formulaDTO);
    }

    @Test
    public void validateFormulaAreaCirculo() throws ValidationException {
        FormulaDTO formulaDTO = FormulaDTO.builder()
                .radio(5.0)
                .build();
        ValidationFields.validateFormulaAreaCirculo(formulaDTO);
    }

}
