package com.co.restservice.clientAdapter;

import com.co.operation.GetOperationRequest;
import com.co.operation.GetOperationResponse;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import com.co.restservice.service.OperationService;
import com.co.restservice.utils.ApplicationProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class OperationClient extends WebServiceGatewaySupport implements IOperationClient {

    private static final Logger logger = LogManager.getLogger(OperationClient.class);

    private static String OPERATION_ADDRESS_LOCATION = ApplicationProperties.getInstance().getProperty("soap.service");

    private SoapClientService soapClientService;

    @Autowired
    public OperationClient(SoapClientService soapClientService) {
        this.soapClientService = soapClientService;
    }

    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) throws Exception {
        logger.info("OperationClient :: operation :: consuming service");
        ObjectMapper objectMapper = new ObjectMapper();
        GetOperationRequest getOperationRequest = objectMapper.convertValue(operationRequestDTO, GetOperationRequest.class);
        GetOperationResponse response = soapClientService.callSoapService(OPERATION_ADDRESS_LOCATION,
                ApplicationProperties.getInstance().getProperty("soap.service.action"), getOperationRequest);

        if (!StringUtils.isEmpty(response.getErrorMessage())) {
            logger.error("OperationClient :: operation :: " + response.getErrorMessage());
            throw new Exception(response.getErrorMessage());
        }
        if (!NumberUtils.isCreatable(String.valueOf(response.getResult()))) {
            logger.error("OperationClient :: operation :: " + "The math operation isn't possible");
            throw new ArithmeticException("The math operation isn't possible");
        }
        return objectMapper.convertValue(response, OperationResponseDTO.class);
    }
}
