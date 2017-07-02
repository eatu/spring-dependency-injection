package com.eatu.spring.di.config;

import org.springframework.context.annotation.*;

import com.eatu.spring.di.services.*;

@Configuration
@ComponentScan(value={"com.eatu.spring.di.dispatcher"})
public class ServiceConfig {

    @Bean
    public MessageService getService(){
        return new EmailService();
    }
}
