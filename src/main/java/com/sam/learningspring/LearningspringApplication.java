package com.sam.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningspringApplication {

	public static void main(String[] args) {
		System.out.println("The application is starting ....");
		SpringApplication.run(LearningspringApplication.class, args);
	}
}
