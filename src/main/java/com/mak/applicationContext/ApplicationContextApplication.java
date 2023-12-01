package com.mak.applicationContext;

import bean.classes.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("bean.classes")
public class ApplicationContextApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ApplicationContextApplication.class, args);
		Student bean =context.getBean(Student.class);
		System.out.println(bean);
	}

}
