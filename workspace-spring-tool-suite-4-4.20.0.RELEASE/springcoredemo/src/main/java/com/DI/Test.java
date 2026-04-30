package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer ct= (Customer) context.getBean("cust");
		System.out.println(ct);
		
		
		
		Employee emp =  context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		
		
	}

}
