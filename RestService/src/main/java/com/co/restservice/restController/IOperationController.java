package com.co.restservice.restController;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;

public interface IOperationController {

    OperationResponseDTO operation(OperationRequestDTO operationRequestDTO);

}
