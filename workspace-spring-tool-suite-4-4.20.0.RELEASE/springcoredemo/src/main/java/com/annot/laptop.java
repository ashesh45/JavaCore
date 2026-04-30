package com.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class laptop {
	
	
	  @Autowired   //  Field Injection
	    private Processor processor;

	    public void start() {
	        processor.process();
	        System.out.println("Laptop started...");
	    }

}
