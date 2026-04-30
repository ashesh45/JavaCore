package com.annotation;

import org.springframework.stereotype.Component;

@Component("EnglishTeacher")
public class EnglishTeacher implements TeacherService {

	@Override
	public void teach() {
		System.out.println("teach english");
		
	}

}
