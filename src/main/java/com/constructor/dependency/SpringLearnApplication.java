package com.constructor.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
@SpringBootApplication
public class SpringLearnApplication {
// Following is the content of the MainApp.java file. Here you need to register a shutdown hook registerShutdownHook() method 
// that is declared on the AbstractApplicationContext class. This will ensure a graceful shutdown and call the relevant destroy methods.
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeansP.xml");
		Parent parent = (Parent)context.getBean("parent");
	}

}
