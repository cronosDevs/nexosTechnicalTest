package com.co.restservice.utils;

import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationRequestDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.ObjectUtils;

import javax.xml.bind.ValidationException;

/**
 * Used to validate data
 *
 * @author Orlando Velasquez
 */
public class ValidationFields {

    /**
     * Used to create logs
     */
    private static final Logger logger = LogManager.getLogger(ValidationFields.class);

    /**
     * Method used to validate operation data
     *
     * @param operationRequestDTO request payload
     * @throws ValidationException if the data is null or empty
     */
    public static void validateOperationFields(OperationRequestDTO operationRequestDTO) throws ValidationException {
        logger.info("ValidationFields :: validateOperationFields");
        if (ObjectUtils.isEmpty(operationRequestDTO.getNumOne())
                || ObjectUtils.isEmpty(operationRequestDTO.getNumTwo())
                || ObjectUtils.isEmpty(operationRequestDTO.getOperator())) {
            logger.error("ValidationFields :: validateOperationFields");
            throw new ValidationException("the numbers One or Two should not be null");
        }
    }

    /**
     * Method used to validate if the data is complete
     *
     * @param formulaDTO request payload
     * @throws ValidationException if the data is null or empty
     */
    public static void validateFormulaPendienteFields(FormulaDTO formulaDTO) throws ValidationException {
        logger.info("ValidationFields :: validateFormulaPendienteFields");
        if (ObjectUtils.isEmpty(formulaDTO.getY2())
                || ObjectUtils.isEmpty(formulaDTO.getY1())
                || ObjectUtils.isEmpty(formulaDTO.getX2())
                || ObjectUtils.isEmpty(formulaDTO.getX2())) {
            logger.error("ValidationFields :: validateFormulaPendienteFields");
            throw new ValidationException("y2, y1, x2, x1 should not be null or empty");
        }
    }

    /**
     * Method used to validate if the data is complete
     *
     * @param formulaDTO request payload
     * @throws ValidationException if the data is null or empty
     */
    public static void validateFormulaPromedio(FormulaDTO formulaDTO) throws ValidationException {
        logger.info("ValidationFields :: validateFormulaPromedio");
        if (ObjectUtils.isEmpty(formulaDTO.getAvgNumbers()) || formulaDTO.getAvgNumbers().isEmpty()) {
            logger.error("ValidationFields :: validateFormulaPromedio");
            throw new ValidationException("the avg numbers list should not be null or empty");
        }
    }

    /**
     * Method used to validate if the data is complete
     *
     * @param formulaDTO request payload
     * @throws ValidationException if the data is null or empty
     */
    public static void validateFormulaAreaTriangulo(FormulaDTO formulaDTO) throws ValidationException {
        logger.info("ValidationFields :: validateFormulaAreaTriangulo");
        if (ObjectUtils.isEmpty(formulaDTO.getBase()) || ObjectUtils.isEmpty(formulaDTO.getAltura())) {
            logger.error("ValidationFields :: validateFormulaAreaTriangulo");
            throw new ValidationException("the base and altura should not be null or empty");
        }
    }

    /**
     * Method used to validate if the data is complete
     *
     * @param formulaDTO request payload
     * @throws ValidationException if the data is null or empty
     */
    public static void validateFormulaAreaCirculo(FormulaDTO formulaDTO) throws ValidationException {
        logger.info("ValidationFields :: validateFormulaAreaCirculo");
        if (ObjectUtils.isEmpty(formulaDTO.getRadio())) {
            logger.error("ValidationFields :: validateFormulaAreaCirculo");
            throw new ValidationException("tha radio should not be null or empty");
        }
    }

}
