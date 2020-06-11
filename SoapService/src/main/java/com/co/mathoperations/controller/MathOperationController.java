package com.co.mathoperations.controller;

import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;
import com.co.mathoperations.service.IMathOperationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Used to controller service class
 *
 * @author Orlando Velasquez
 */
@Endpoint
public class MathOperationController implements IMathOperationController {

    private static final Logger logger = LogManager.getLogger(MathOperationController.class);

    private static final String NAMESPACE_URI = "http://technicaltest.com/web-service-soap";

    private IMathOperationService iMathOperationService;

    /**
     * Constructor used to dependency injection
     *
     * @param iMathOperationService
     */
    @Autowired
    public MathOperationController(IMathOperationService iMathOperationService) {
        this.iMathOperationService = iMathOperationService;
    }


    /**
     * Method used to do an mathematical operation
     *
     * @param request payload request
     * @return object response
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOperationRequest")
    @ResponsePayload
    public GetOperationResponse operation(@RequestPayload GetOperationRequest request) {
        logger.info("MathOperationController :: operation");
        return iMathOperationService.operation(request);
    }

}
