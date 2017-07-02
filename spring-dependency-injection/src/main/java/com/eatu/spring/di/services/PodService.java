package com.eatu.spring.di.services;

public class PodService implements MessageService {

    public boolean sendMessag(String msg, String rec) {
        System.out.println("Pod Sent to "+rec+ " with Message="+msg);
        return true;
    }

}
