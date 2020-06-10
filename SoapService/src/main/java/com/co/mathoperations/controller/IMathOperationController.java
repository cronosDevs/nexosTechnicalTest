package com.co.mathoperations.controller;

import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.domain.GetOperationResponse;

public interface IMathOperationController {

    GetOperationResponse operation(GetOperationRequest getOperationRequest);

}
