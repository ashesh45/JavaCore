package com.annot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	  @Autowired   // 👈 direct class inject
	    private Book book;

	    public void study() {
	        book.read();
	        System.out.println("Student is studying...");
	    }

}
