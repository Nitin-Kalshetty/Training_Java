package com.cf.spring.controller;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;
@Component
public class Listen {

  @EventListener
  public void handleEvent (RequestHandledEvent e) {
      System.out.println("-- RequestHandledEvent --");
}
}