package com.co.restservice.clientAdapter.config;

import com.co.restservice.clientAdapter.SoapClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    private static final Logger logger = LogManager.getLogger(SoapClientConfig.class);

    @Bean
    public Jaxb2Marshaller marshaller() {
        logger.info("SoapClientConfig :: marshaller :: configuring marshaller");
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.co.operation");
        return marshaller;
    }

    @Bean
    public SoapClientService soapClientService(Jaxb2Marshaller marshaller) {
        logger.info("SoapClientConfig :: soapClientService :: configuring soapClientService");
        SoapClientService client = new SoapClientService();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
