package com.example.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmailApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmailApiApplication.class, args);
		System.out.println("Done");
	}

}
