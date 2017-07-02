package com.eatu.spring.di.services;

public class TextService implements MessageService {

    public boolean sendMessag(String msg, String rec) {
        System.out.println("Text Sent to "+rec+ " with Message="+msg);
        return true;
    }

}
