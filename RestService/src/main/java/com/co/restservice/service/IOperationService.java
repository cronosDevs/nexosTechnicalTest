package com.co.restservice.service;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;

public interface IOperationService {

    OperationResponseDTO operation(OperationRequestDTO operationRequestDTO);

}
