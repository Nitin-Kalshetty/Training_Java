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
       
       Student singletonObject1 = (Student) ctx.getBean("studentSingleton");
       Student singletonObject2 = (Student) ctx.getBean("studentSingleton");
       System.out.println(singletonObject1+" and backpack object is "+singletonObject1.getBackpack());
       System.out.println(singletonObject2+" and backpack object is "+singletonObject2.getBackpack());
       
       
       
       Student prototypeObject1 = (Student) ctx.getBean("studentPrototype");
       Student prototypeObject2 = (Student) ctx.getBean("studentPrototype");
       System.out.println(prototypeObject1+" and backpack object is "+prototypeObject1.getBackpack());
       System.out.println(prototypeObject2+" and backpack object is "+prototypeObject2.getBackpack());
       
      
    }
}
