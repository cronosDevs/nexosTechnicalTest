package com.co.restservice.clientAdapter;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;

public interface IOperationClient {

    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) throws Exception;

}
