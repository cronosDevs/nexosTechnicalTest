package com.co.mathoperations.service;

import com.co.mathoperations.common.constant.AppConstant;
import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;
import com.co.mathoperations.utils.ValidationFields;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Used to logical service class
 *
 * @author Orlando Velasquez
 */
@Service
public class MathOperationService implements IMathOperationService {

    /**
     * Used to create logs
     */
    private static final Logger logger = LogManager.getLogger(MathOperationService.class);

    /**
     * Method Used to do a mathematical operation
     *
     * @param getOperationRequest payload request
     * @return object response
     */
    @Override
    public GetOperationResponse operation(GetOperationRequest getOperationRequest) {
        try {
            logger.info("MathOperationService :: operation");
            ValidationFields.validateNumbers(getOperationRequest);
            ValidationFields.validateOperatorExistence(getOperationRequest);
            double result = 0.0;
            switch (getOperationRequest.getOperator()) {
                case AppConstant.ADD:
                    logger.info("MathOperationService :: operation :: add");
                    result = getOperationRequest.getNumOne() + getOperationRequest.getNumTwo();
                    break;
                case AppConstant.SUBTRACTION:
                    logger.info("MathOperationService :: operation :: subtraction");
                    result = getOperationRequest.getNumOne() - getOperationRequest.getNumTwo();
                    break;
                case AppConstant.MULTIPLY:
                    logger.info("MathOperationService :: operation :: multiply");
                    result = getOperationRequest.getNumOne() * getOperationRequest.getNumTwo();
                    break;
                case AppConstant.DIVIDE:
                    logger.info("MathOperationService :: operation :: divide");
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
            logger.error("MathOperationService :: operation :: " + ex.getMessage());
            return GetOperationResponse.builder()
                    .errorMessage(ex.getMessage())
                    .build();
        }
    }

}
