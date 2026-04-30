package com.annot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	 @Value("Ram")     // 👈 value inject
	    private String name;

	    @Value("25")
	    private int age;

	    public void show() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

}
