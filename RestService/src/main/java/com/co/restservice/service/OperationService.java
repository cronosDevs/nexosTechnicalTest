package com.co.restservice.service;

import com.co.restservice.clientAdapter.IOperationClient;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.xml.bind.ValidationException;

@Service
public class OperationService implements IOperationService {

    IOperationClient iOperationClient;

    @Autowired
    public OperationService(IOperationClient iOperationClient) {
        this.iOperationClient = iOperationClient;
    }

    @Override
    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) throws Exception {
        validateFields(operationRequestDTO);
        return iOperationClient.operation(operationRequestDTO);
    }


    private void validateFields(OperationRequestDTO operationRequestDTO) throws ValidationException {
        if (ObjectUtils.isEmpty(operationRequestDTO.getNumOne())
                || ObjectUtils.isEmpty(operationRequestDTO.getNumTwo())
                || ObjectUtils.isEmpty(operationRequestDTO.getOperator())) {
            throw new ValidationException("the number One or Two or operator should not be null");
        }
    }

}
