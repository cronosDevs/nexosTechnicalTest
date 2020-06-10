package com.co.mathoperations.service;

import com.technicaltest.web_service_soap.GetOperationRequest;
import com.technicaltest.web_service_soap.GetOperationResponse;
import org.springframework.stereotype.Service;

@Service
public class MathOperationService implements IMathOperationService {

    @Override
    public GetOperationResponse add(GetOperationRequest getOperationRequest) {
        return null;
    }

    @Override
    public GetOperationResponse subtract(GetOperationRequest getOperationRequest) {
        return null;
    }

    @Override
    public GetOperationResponse multiply(GetOperationRequest getOperationRequest) {
        return null;
    }

    @Override
    public GetOperationResponse divide(GetOperationRequest getOperationRequest) {
        return null;
    }
}
