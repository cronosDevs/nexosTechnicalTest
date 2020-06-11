package com.co.restservice.clientAdapter.config;

import com.co.restservice.clientAdapter.SoapClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Used to configure the SOAP client
 *
 * @author Orlando Velasquez
 */
@Configuration
public class SoapClientConfig {

    /**
     * Used to create logs
     */
    private static final Logger logger = LogManager.getLogger(SoapClientConfig.class);

    /**
     * Method used to deserialize based in a wsdl
     *
     * @return Jaxb2Marshaller
     */
    @Bean
    public Jaxb2Marshaller marshaller() {
        logger.info("SoapClientConfig :: marshaller :: configuring marshaller");
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.co.operation");
        return marshaller;
    }

    /**
     * Method used to configure the SOAP client
     *
     * @param marshaller Jaxb2Marshaller
     * @return SOAP client configured
     */
    @Bean
    public SoapClientService soapClientService(Jaxb2Marshaller marshaller) {
        logger.info("SoapClientConfig :: soapClientService :: configuring soapClientService");
        SoapClientService client = new SoapClientService();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
