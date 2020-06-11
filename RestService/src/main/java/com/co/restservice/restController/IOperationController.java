package com.co.restservice.restController;

import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IOperationController {

    ResponseEntity<?> add(OperationRequestDTO operationRequestDTO);

    ResponseEntity<?> subtract(OperationRequestDTO operationRequestDTO);

    ResponseEntity<?> multiply(OperationRequestDTO operationRequestDTO);

    ResponseEntity<?> divide(OperationRequestDTO operationRequestDTO);

    ResponseEntity<?> formula(FormulaDTO formulaDTO, String formulaName);

}
