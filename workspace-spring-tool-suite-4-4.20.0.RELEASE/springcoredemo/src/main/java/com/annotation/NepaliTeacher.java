package com.annotation;

import org.springframework.stereotype.Component;

@Component("NepaliTeacher")
public class NepaliTeacher implements TeacherService {

	@Override
	public void teach() {
		System.out.println("teach nepali");
		
	}

}
