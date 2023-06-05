package com.rocker.DynamicScope;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

    		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the data base name : ");
    		System.out.println("enter 1 for oracle");
    		System.out.println("enter 2 for mysql");

    		MultipleDatabaseController mdc= (MultipleDatabaseController) ctx.getBean("multipleDatabaseController");
    		int val =sc.nextInt();
    		if(val==1) {
    			System.out.println(mdc.loadProperties("oracle"));
    		}else if(val==2) {
    			System.out.println(mdc.loadProperties("mysql"));
    		}else {
    			System.out.println("Invalid input....");
    		}
    		
    	
    	
    }
}
