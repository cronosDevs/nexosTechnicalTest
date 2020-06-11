package com.co.restservice.service;

import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;

public interface IOperationService {

    OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) throws Exception;

    OperationResponseDTO formulaPendiente(FormulaDTO formulaDTO) throws Exception;

    OperationResponseDTO formulaPromedio(FormulaDTO formulaDTO) throws Exception;

    OperationResponseDTO formulaAreaTriangulo(FormulaDTO formulaDTO) throws Exception;

    OperationResponseDTO formulaAreaCirculo(FormulaDTO formulaDTO) throws Exception;

}
