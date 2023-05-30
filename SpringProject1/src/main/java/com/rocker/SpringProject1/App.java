package com.rocker.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //Bean Factory
//    	Resource res = new ClassPathResource("config.xml");
//    	BeanFactory beanFactory = new XmlBeanFactory(res);
//    	Car c1 =(Car) beanFactory.getBean("car1");
//    	System.out.println(c1);
//    	Car c2 =(Car) beanFactory.getBean("car1");
//    	System.out.println(c2);
//    	Car c3 =(Car) beanFactory.getBean("car1");
//    	System.out.println(c3);
    	
    	
    	//Application Context
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Car ac1 = (Car) ctx.getBean("car1");
    	System.out.println(ac1+"I am ac1");
    	Car ac2 = (Car) ctx.getBean("car1");
    	System.out.println(ac2+"I am ac2");
    	Car ac3 = (Car) ctx.getBean("car1");
    	System.out.println(ac3+"I am ac3");
    	Car ac11 = (Car) ctx.getBean("car2");
    	System.out.println(ac11+"I am ac11");
    	Car ac12 = (Car) ctx.getBean("car2");
    	System.out.println(ac12+"I am ac12");
    	Car ac13 = (Car) ctx.getBean("car2");
    	System.out.println(ac13+"I am ac13");
    	Car ac14 = ctx.getBean(Car.class);
    	System.out.println(ac14+"I am ac14");
    	
    	
    	
    	
    	
    }
}
