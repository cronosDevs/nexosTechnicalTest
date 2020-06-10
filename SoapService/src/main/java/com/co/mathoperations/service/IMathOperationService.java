package com.co.mathoperations.service;

import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;

public interface IMathOperationService {

    GetOperationResponse operation(GetOperationRequest getOperationRequest);

}
