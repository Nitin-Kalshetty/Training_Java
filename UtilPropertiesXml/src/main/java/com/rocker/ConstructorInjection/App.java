package com.rocker.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	


public class App {
	

    public static void main( String[] args ){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
       User user = (User) ctx.getBean("user");
       System.out.println(user.getMyName());
       System.out.println(user.getMyContact());
      
    }
}
