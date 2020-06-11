package com.co.restservice.clientAdapter;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Used to consume SOAP web services
 *
 * @author Orlando Velasquez
 */
public class SoapClientService extends WebServiceGatewaySupport {

    /**
     * Method use to consume SOAP web service
     *
     * @param location web service location
     * @param soapAction soap action name
     * @param request request payload
     * @param <T> generic class
     * @return generic class payload response
     */
    @SuppressWarnings("unchecked")
    public <T> T callSoapService(String location, String soapAction, Object request) {
        T ret = null;
        WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
        SoapActionCallback soapActionCallback = new SoapActionCallback(soapAction);
        ret = (T) webServiceTemplate.marshalSendAndReceive(location, request, soapActionCallback);
        return ret;
    }

}
