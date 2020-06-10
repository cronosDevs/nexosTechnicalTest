package com.co.restservice.restController;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import org.springframework.http.ResponseEntity;

public interface IOperationController {

    ResponseEntity<?> operation(OperationRequestDTO operationRequestDTO);

}
