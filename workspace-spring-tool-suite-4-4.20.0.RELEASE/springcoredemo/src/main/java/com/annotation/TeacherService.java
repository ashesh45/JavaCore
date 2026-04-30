package com.annotation;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.annotation")
public interface TeacherService {
	void teach();

}
