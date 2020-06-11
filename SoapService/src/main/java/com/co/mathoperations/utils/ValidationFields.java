package com.co.mathoperations.utils;

import com.co.mathoperations.domain.GetOperationRequest;
import org.springframework.util.StringUtils;

/**
 * Used to validate data
 *
 * @author Orlando Velasquez
 */
public class ValidationFields {

    /**
     * Method used to validate numbers operation existence
     *
     * @param getOperationRequest payload request
     * @throws Exception if the fields are empty or null
     */
    public static void validateNumbers(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getNumOne()) || StringUtils.isEmpty(getOperationRequest.getNumTwo())) {
            throw new Exception("The number one and two should not be null or letters");
        }
    }

    /**
     * Method used to validate operator existence
     *
     * @param getOperationRequest payload request
     * @throws Exception if the fields are empty or null
     */
    public static void validateOperatorExistence(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getOperator())) {
            throw new Exception("The Operator should not be null");
        }
    }

}
