package com.co.restservice.utils;

import com.co.restservice.domain.OperationRequestDTO;
import org.springframework.util.ObjectUtils;

import javax.xml.bind.ValidationException;

public class Validation {

    public static void validateFields(OperationRequestDTO operationRequestDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(operationRequestDTO.getNumOne())
                || ObjectUtils.isEmpty(operationRequestDTO.getNumTwo())
                || ObjectUtils.isEmpty(operationRequestDTO.getOperator())) {
            throw new ValidationException("the number One or Two should not be null");
        }
    }

}
