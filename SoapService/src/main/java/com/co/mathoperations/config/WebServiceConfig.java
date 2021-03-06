package com.co.mathoperations.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Used to configure the soap server
 *
 * @author Orlando Velasquez
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    /**
     * Used to create logs
     */
    private static final Logger logger = LogManager.getLogger(WebServiceConfig.class);

    /**
     * Method used to configure the server soap dispatcher
     *
     * @param applicationContext application context
     * @return Servlet bean
     */
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        logger.info("WebServiceConfig :: messageDispatcherServlet");
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    /**
     * Method used to load the XSD Schema
     *
     * @return XSD schema
     */
    @Bean
    public XsdSchema userSchema() {
        logger.info("WebServiceConfig :: userSchema");
        return new SimpleXsdSchema(new ClassPathResource("operation.xsd"));
    }

    /**
     * Method used to set up the wsdl
     *
     * @return WSDL Definition
     */
    @Bean(name = "operations")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema operationSchema) {
        logger.info("WebServiceConfig :: defaultWsdl11Definition");
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(operationSchema);
        definition.setLocationUri("/ws");
        definition.setPortTypeName("OperationPort");
        definition.setTargetNamespace("http://technicaltest.com/web-service-soap");
        return definition;
    }

}