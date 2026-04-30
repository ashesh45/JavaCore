package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements TeacherService {

	@Override
	public void teach() {
		System.out.println("teach math");
		
	}

}
