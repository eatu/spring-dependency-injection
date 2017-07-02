package com.eatu.spring.di.main;

import org.springframework.context.annotation.*;

import com.eatu.spring.di.config.*;
import com.eatu.spring.di.dispatcher.*;

// comment
public class MainApplication {

    public static void main(String[] args){
        System.out.println("Main App");

        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ServiceConfig.class);
        ServiceDispatcher dispatcher = context.getBean(ServiceDispatcher.class);
        dispatcher.dispatchService("Hello", "joe@doe.com");
        
        context.close();
    }
}
