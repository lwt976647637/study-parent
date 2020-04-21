package com.lwt.study.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lwt"})
public class StudyTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyTaskApplication.class, args);
	}

}
