package com.co.restservice.utils;

import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import org.springframework.util.ObjectUtils;

import javax.xml.bind.ValidationException;

public class ValidationFields {

    public static void validateOperationFields(OperationRequestDTO operationRequestDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(operationRequestDTO.getNumOne())
                || ObjectUtils.isEmpty(operationRequestDTO.getNumTwo())
                || ObjectUtils.isEmpty(operationRequestDTO.getOperator())) {
            throw new ValidationException("the numbers One or Two should not be null");
        }
    }

    public static void validateFormulaPendienteFields(FormulaDTO formulaDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(formulaDTO.getY2())
                || ObjectUtils.isEmpty(formulaDTO.getY1())
                || ObjectUtils.isEmpty(formulaDTO.getX2())
                || ObjectUtils.isEmpty(formulaDTO.getX2())) {
            throw new ValidationException("y2, y1, x2, x1 should not be null or empty");
        }
    }

    public static void validateFormulaPromedio(FormulaDTO formulaDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(formulaDTO.getAvgNumbers()) || formulaDTO.getAvgNumbers().isEmpty()) {
            throw new ValidationException("the avg numbers list should not be null or empty");
        }
    }

    public static void validateFormulaAreaTriangulo(FormulaDTO formulaDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(formulaDTO.getBase()) || ObjectUtils.isEmpty(formulaDTO.getAltura())) {
            throw new ValidationException("tha base and altura should not be null or empty");
        }
    }

    public static void validateFormulaAreaCirculo(FormulaDTO formulaDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(formulaDTO.getRadio())) {
            throw new ValidationException("tha radio should not be null or empty");
        }
    }

}
