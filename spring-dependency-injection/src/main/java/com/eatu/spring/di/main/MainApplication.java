package com.eatu.spring.di.main;

import org.springframework.context.annotation.*;

import com.eatu.spring.di.config.*;
import com.eatu.spring.di.dispatcher.*;
import com.eatu.spring.di.services.TextService;

// comment
public class MainApplication {

    public static void main(String[] args){
        System.out.println("Main App");

        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext();
        context.register(TextService.class);
        context.register(ServiceDispatcher.class);
        context.refresh();
        ServiceDispatcher dispatcher = context.getBean(ServiceDispatcher.class);
        dispatcher.dispatchService("Hello", "joe@doe.com");
        
        context.close();
    }
}
