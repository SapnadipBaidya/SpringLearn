package org.learn.spring;

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
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		
		// A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container
		
		helloSpring.getMessage();
		
		HelloSpring helloSpring1 = (HelloSpring) context.getBean("helloSpring");
		helloSpring1.getMessage();
		HelloSpring helloSpring2 = (HelloSpring) context.getBean("helloSpring");
		helloSpring2.getMessage();
		helloSpring2.setMessage("i am  groot");
		helloSpring2.getMessage();
		HelloSpring helloSpring3 = (HelloSpring) context.getBean("helloSpring");
		helloSpring3.getMessage();
		HelloSpring helloSpring4 = (HelloSpring) context.getBean("helloSpring");
		helloSpring4.getMessage();
		
		HelloSpringChild child = (HelloSpringChild)context.getBean("helloSpringChild");
		child.getMessage();
		
		
		TextEditor txtedit = (TextEditor)context.getBean("textEditor");
		txtedit.spellCheck();
		
		//implementing  java collections using beans
		
		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
		jc.getAddessList();
		jc.getAddressMap();
		jc.getAddressSet();
		jc.getAddressProperties();
		
		context.registerShutdownHook();
		
	}

}
