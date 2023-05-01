package com.example;

import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.util.EnvironmentPropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.expression.EnvironmentAccessor;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class DemoApplication {
	@Autowired
	Environment env;
	@PostConstruct
	public void init(){
		System.out.println(env.getProperty("student.last_name"));
		System.out.println(env.getProperty("student.name"));
		System.out.println(env.getProperty("student.group"));
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}
