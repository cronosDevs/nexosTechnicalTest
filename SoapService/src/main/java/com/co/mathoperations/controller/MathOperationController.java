package com.co.mathoperations.controller;

import com.co.mathoperations.service.IMathOperationService;
import com.technicaltest.web_service_soap.GetOperationRequest;
import com.technicaltest.web_service_soap.GetOperationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MathOperationController  {

    private static final String NAMESPACE_URI = "http://technicaltest.com/web-service-soap";

    @Autowired
    private IMathOperationService iMathOperationService;

//    @Autowired
//    public MathOperationController(IMathOperationService iMathOperationService) {
//        this.iMathOperationService = iMathOperationService;
//    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOperationRequest")
    @ResponsePayload
    public GetOperationResponse add(@RequestPayload GetOperationRequest request) {
        return iMathOperationService.add(request);
    }
//
//    @Override
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequestDTO")
//    @ResponsePayload
//    public GetOperationResponse subtract(@RequestPayload GetOperationRequest operationRequestDTO) {
//        return iMathOperationService.subtract(operationRequestDTO);
//    }
//
//    @Override
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequestDTO")
//    @ResponsePayload
//    public GetOperationResponse multiply(@RequestPayload GetOperationRequest operationRequestDTO) {
//        return iMathOperationService.multiply(operationRequestDTO);
//    }
//
//    @Override
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequestDTO")
//    @ResponsePayload
//    public GetOperationResponse divide(@RequestPayload GetOperationRequest operationRequestDTO) {
//        return iMathOperationService.divide(operationRequestDTO);
//    }

}
