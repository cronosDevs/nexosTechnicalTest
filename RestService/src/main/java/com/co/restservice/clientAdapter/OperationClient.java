package com.co.restservice.clientAdapter;

import com.co.operation.GetOperationRequest;
import com.co.operation.GetOperationResponse;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import com.co.restservice.utils.ApplicationProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class OperationClient extends WebServiceGatewaySupport implements IOperationClient {

    private static String OPERATION_ADDRESS_LOCATION = ApplicationProperties.getInstance().getProperty("soap.service");

    private SoapClientService soapClientService;

    @Autowired
    public OperationClient(SoapClientService soapClientService) {
        this.soapClientService = soapClientService;
    }

    public OperationResponseDTO operation(OperationRequestDTO operationRequestDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        GetOperationRequest getOperationRequest = objectMapper.convertValue(operationRequestDTO, GetOperationRequest.class);
        GetOperationResponse response = soapClientService.callSoapService(OPERATION_ADDRESS_LOCATION,
                ApplicationProperties.getInstance().getProperty("soap.service.action"), getOperationRequest);
        return objectMapper.convertValue(response, OperationResponseDTO.class);
    }
}
