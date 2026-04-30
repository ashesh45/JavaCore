package com.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	
	 public static void main(String[] args) {

	        ApplicationContext context =
	                new AnnotationConfigApplicationContext(Appconfig.class);

	        laptop laptop = context.getBean(laptop.class);
	        laptop.start();
	    }

}
