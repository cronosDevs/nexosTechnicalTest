package com.co.mathoperations.controller;
import com.co.mathoperations.domain.OperationRequestDTO;
import com.co.mathoperations.domain.OperationResponseDTO;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import javax.xml.ws.WebEndpoint;

@Endpoint
public class MathOperationController implements IMathOperationController {

    private static final String NAMESPACE_URI = "http://formacion.ipartek.com/web-service-soap";

    @Override
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "operationRequestDTO")
    @ResponsePayload
    public OperationResponseDTO add(@RequestPayload OperationRequestDTO operationRequestDTO) {
        return null;
    }

    @Override
    public OperationResponseDTO subtract(@RequestPayload OperationRequestDTO operationRequestDTO) {
        return null;
    }

    @Override
    public OperationResponseDTO multiply(@RequestPayload OperationRequestDTO operationRequestDTO) {
        return null;
    }

    @Override
    public OperationResponseDTO divide(@RequestPayload OperationRequestDTO operationRequestDTO) {
        return null;
    }

}
