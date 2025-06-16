package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsrFormDatabaseApplication {

	public static void main(String[] args) {
		System.out.println("This is UserForm Practice");
		
		SpringApplication.run(UsrFormDatabaseApplication.class, args);
		
		System.out.println("Let's Connect it to DB");		
	}

}
