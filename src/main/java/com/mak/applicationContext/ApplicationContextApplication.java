package com.mak.applicationContext;

import bean.classes.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("bean.classes")
public class ApplicationContextApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ApplicationContextApplication.class, args);
		Student bean =context.getBean(Student.class);
		System.out.println(bean);
	}

}
