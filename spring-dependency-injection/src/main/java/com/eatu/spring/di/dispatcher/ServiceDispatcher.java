package com.eatu.spring.di.dispatcher;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import  com.eatu.spring.di.services.*;

@Component
public class ServiceDispatcher {

  private MessageService service;
  
  @Autowired
  public void setService(MessageService svc){
      service = svc;
  }
  
  public boolean dispatchService(String msg, String rec){
      return service.sendMessag(msg, rec);
  }
}
