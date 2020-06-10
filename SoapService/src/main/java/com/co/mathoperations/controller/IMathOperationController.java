package com.co.mathoperations.controller;

import com.co.mathoperations.domain.OperationRequestDTO;
import com.co.mathoperations.domain.OperationResponseDTO;

public interface IMathOperationController {

    OperationResponseDTO add(OperationRequestDTO operationRequestDTO);

    OperationResponseDTO subtract(OperationRequestDTO operationRequestDTO);

    OperationResponseDTO multiply(OperationRequestDTO operationRequestDTO);

    OperationResponseDTO divide(OperationRequestDTO operationRequestDTO);

}
