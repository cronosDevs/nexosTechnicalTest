package com.co.restservice.service;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements IOperationService {

    @Override
    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) {
        return null;
    }
}
