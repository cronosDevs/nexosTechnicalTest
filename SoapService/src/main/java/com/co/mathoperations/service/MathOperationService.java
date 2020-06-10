package com.co.mathoperations.service;

import com.co.mathoperations.common.constant.AppConstant;
import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MathOperationService implements IMathOperationService {

    @Override
    public GetOperationResponse operation(GetOperationRequest getOperationRequest) {
        try {
            validateNumbers(getOperationRequest);
            validateOperatorExistence(getOperationRequest);
            double result = 0.0;
            switch (getOperationRequest.getOperator()) {
                case AppConstant.ADD:
                    result = getOperationRequest.getNumOne() + getOperationRequest.getNumTwo();
                    break;
                case AppConstant.SUBTRACTION:
                    result = getOperationRequest.getNumOne() - getOperationRequest.getNumTwo();
                    break;
                case AppConstant.MULTIPLY:
                    result = getOperationRequest.getNumOne() * getOperationRequest.getNumTwo();
                    break;
                case AppConstant.DIVIDE:
                    result = getOperationRequest.getNumOne() / getOperationRequest.getNumTwo();
                    break;
                default:
                    return GetOperationResponse.builder()
                            .errorMessage("The Operator is not valid")
                            .build();
            }
            return GetOperationResponse.builder()
                    .result(result)
                    .build();
        } catch (Exception ex) {
            return GetOperationResponse.builder()
                    .errorMessage(ex.getMessage())
                    .build();
        }
    }

    private void validateNumbers(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getNumOne()) || StringUtils.isEmpty(getOperationRequest.getNumTwo())) {
            throw new Exception("The number one and two should not be null or letters");
        }
    }

    private void validateOperatorExistence(GetOperationRequest getOperationRequest) throws Exception {
        if (StringUtils.isEmpty(getOperationRequest.getOperator())) {
            throw new Exception("The Operator should not be null");
        }
    }

}
