package com.annot;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Intel Processor is processing...");
	}

}
