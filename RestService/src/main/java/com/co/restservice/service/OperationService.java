package com.co.restservice.service;

import com.co.restservice.clientAdapter.IOperationClient;
import com.co.restservice.commons.constant.AppConstant;
import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import com.co.restservice.utils.ValidationFields;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Used to logical rest service
 *
 * @author Orlando Velasquez
 */
@Service
public class OperationService implements IOperationService {

    /**
     * Used to create logs
     */
    private static final Logger logger = LogManager.getLogger(OperationService.class);

    IOperationClient iOperationClient;

    @Autowired
    public OperationService(IOperationClient iOperationClient) {
        this.iOperationClient = iOperationClient;
    }

    /**
     * Method used to perform a mathematical operation
     *
     * @param operationRequestDTO request payload
     * @return response payload
     */
    @Override
    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) throws Exception {
        logger.info("OperationService :: operation");
        ValidationFields.validateOperationFields(operationRequestDTO);
        return iOperationClient.operation(operationRequestDTO);
    }

    /**
     * Method used to calculate la formula de la pendiente
     *
     * @param formulaDTO request payload
     * @return response payload
     * @throws Exception if the fields are invalid
     */
    public OperationResponseDTO formulaPendiente(FormulaDTO formulaDTO) throws Exception {
        logger.info("OperationService :: formulaPendiente");
        ValidationFields.validateFormulaPendienteFields(formulaDTO);
        Double responseOne = this.operation(
                OperationRequestDTO.builder()
                        .numOne(formulaDTO.getY2())
                        .numTwo(formulaDTO.getY1())
                        .operator(AppConstant.SUBTRACTION)
                        .build()).getResult();

        Double responseTwo = this.operation(
                OperationRequestDTO.builder()
                        .numOne(formulaDTO.getX2())
                        .numTwo(formulaDTO.getX1())
                        .operator(AppConstant.SUBTRACTION)
                        .build()).getResult();

        return this.operation(
                OperationRequestDTO.builder()
                        .numOne(responseOne)
                        .numTwo(responseTwo)
                        .operator(AppConstant.DIVIDE)
                        .build());
    }

    /**
     * Method used to calculate la formula del promedio
     *
     * @param formulaDTO request payload
     * @return response payload
     * @throws Exception if the fields are invalid
     */
    public OperationResponseDTO formulaPromedio(FormulaDTO formulaDTO) throws Exception {
        logger.info("OperationService :: formulaPromedio");
        ValidationFields.validateFormulaPromedio(formulaDTO);
        Double summation = 0.0;
        for (Double avgNumber : formulaDTO.getAvgNumbers()) {
            summation = this.operation(
                    OperationRequestDTO.builder()
                            .numOne(avgNumber)
                            .numTwo(summation)
                            .operator(AppConstant.ADD)
                            .build()).getResult();
        }

        return this.operation(
                OperationRequestDTO.builder()
                        .numOne(summation)
                        .numTwo(Double.parseDouble(Integer.toString(formulaDTO.getAvgNumbers().size())))
                        .operator(AppConstant.DIVIDE)
                        .build());
    }

    /**
     * Method used to calculate el area del triangulo
     *
     * @param formulaDTO request payload
     * @return response payload
     * @throws Exception if the fields are invalid
     */
    public OperationResponseDTO formulaAreaTriangulo(FormulaDTO formulaDTO) throws Exception {
        logger.info("OperationService :: formulaAreaTriangulo");
        ValidationFields.validateFormulaAreaTriangulo(formulaDTO);
        Double responseOne = this.operation(
                OperationRequestDTO.builder()
                        .numOne(formulaDTO.getBase())
                        .numTwo(formulaDTO.getAltura())
                        .operator(AppConstant.MULTIPLY)
                        .build()).getResult();

        return this.operation(
                OperationRequestDTO.builder()
                        .numOne(responseOne)
                        .numTwo(2.0)
                        .operator(AppConstant.DIVIDE)
                        .build());
    }

    /**
     * Method used to calculate el area del circulo
     *
     * @param formulaDTO request payload
     * @return response payload
     * @throws Exception if the fields are invalid
     */
    public OperationResponseDTO formulaAreaCirculo(FormulaDTO formulaDTO) throws Exception {
        logger.info("OperationService :: formulaAreaCirculo");
        ValidationFields.validateFormulaAreaCirculo(formulaDTO);
        Double responseOne = this.operation(
                OperationRequestDTO.builder()
                        .numOne(formulaDTO.getRadio())
                        .numTwo(formulaDTO.getRadio())
                        .operator(AppConstant.MULTIPLY)
                        .build()).getResult();

        return this.operation(
                OperationRequestDTO.builder()
                        .numOne(responseOne)
                        .numTwo(Math.PI)
                        .operator(AppConstant.MULTIPLY)
                        .build());
    }
}
