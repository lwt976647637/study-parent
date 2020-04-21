package com.lwt.study.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lwt"})
public class StudyRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyRestApplication.class, args);
	}

}
