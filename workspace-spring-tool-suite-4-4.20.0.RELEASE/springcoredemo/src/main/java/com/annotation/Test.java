package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(appconfig.class);
		
			College college = context.getBean("colz", College.class);
			college.collegeInof();
			
			
//		Student std =context.getBean("student", Student.class);
//		std.studentInfo();
	}

}
