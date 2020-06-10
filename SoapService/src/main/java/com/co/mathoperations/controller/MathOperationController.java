package com.co.mathoperations.controller;

import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;
import com.co.mathoperations.service.IMathOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MathOperationController implements IMathOperationController{

    private static final String NAMESPACE_URI = "http://technicaltest.com/web-service-soap";

    private IMathOperationService iMathOperationService;

    @Autowired
    public MathOperationController(IMathOperationService iMathOperationService) {
        this.iMathOperationService = iMathOperationService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOperationRequest")
    @ResponsePayload
    public GetOperationResponse operation(@RequestPayload GetOperationRequest request) {
        return iMathOperationService.operation(request);
    }

}
