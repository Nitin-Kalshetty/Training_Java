package com.rocker.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
       
       InjectCollection ij =(InjectCollection) ctx.getBean("injectCollection");
       System.out.println(ij.getCitiesList());
       System.out.println(ij.getCitiesSet());
       System.out.println(ij.getCitiesMap());
       
       
       
      
    }
}
