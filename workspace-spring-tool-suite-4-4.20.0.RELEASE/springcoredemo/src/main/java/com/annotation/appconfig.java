package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation")
public class appconfig {

	@Bean(name = "student")
	public Student getStudentBean() {
		
		
		return new Student();
	}

}
