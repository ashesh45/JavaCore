package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="colz")
public class College {
	
	
	@Value("Molihss")
	private String name;
	
	@Value("987374747")
	private String phone;
	
	@Autowired
	private Student s;
	
	@Autowired
	@Qualifier("NepaliTeacher")
	private TeacherService ts;
	
	public void collegeInof() {
		System.out.println("College Name: " + name);
		System.out.println("College Phone: " + phone);
		
	
		
		s.studentInfo();
		ts.teach();
		
	
	}

}
