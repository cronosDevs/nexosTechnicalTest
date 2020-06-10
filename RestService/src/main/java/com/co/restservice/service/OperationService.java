package com.co.restservice.service;

import com.co.restservice.clientAdapter.IOperationClient;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements IOperationService {

    IOperationClient iOperationClient;

    @Autowired
    public OperationService(IOperationClient iOperationClient) {
        this.iOperationClient = iOperationClient;
    }

    @Override
    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) {
        return iOperationClient.operation(operationRequestDTO);
    }
}
