package com.annot1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
	
	 public static void main(String[] args) {

	        ApplicationContext context =
	                new AnnotationConfigApplicationContext(Appconfig.class);

	        User user = context.getBean(User.class);
	        user.show();
	    }

}
