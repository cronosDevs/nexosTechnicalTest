package com.co.mathoperations.service;

import com.technicaltest.web_service_soap.GetOperationRequest;
import com.technicaltest.web_service_soap.GetOperationResponse;

public interface IMathOperationService {

    GetOperationResponse add(GetOperationRequest getOperationRequest);

    GetOperationResponse subtract(GetOperationRequest getOperationRequest);

    GetOperationResponse multiply(GetOperationRequest getOperationRequest);

    GetOperationResponse divide(GetOperationRequest getOperationRequest);

}
