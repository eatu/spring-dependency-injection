package com.eatu.spring.di.services;

public class EmailService implements MessageService {

    public boolean sendMessag(String msg, String rec) {
        System.out.println("Email Sent to "+rec+ " with Message="+msg);
        return true;
    }

}
