package com.co.mathoperations.utils;

import com.co.mathoperations.domain.GetOperationRequest;
import org.springframework.util.StringUtils;

public class ValidationFields {

    public static void validateNumbers(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getNumOne()) || StringUtils.isEmpty(getOperationRequest.getNumTwo())) {
            throw new Exception("The number one and two should not be null or letters");
        }
    }

    public static void validateOperatorExistence(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getOperator())) {
            throw new Exception("The Operator should not be null");
        }
    }

}
