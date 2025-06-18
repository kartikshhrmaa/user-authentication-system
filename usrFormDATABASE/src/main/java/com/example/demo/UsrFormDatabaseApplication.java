package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsrFormDatabaseApplication {

	public static void main(String[] args) {
		
		/*
		User Authentication and Registration System
			Backend: Spring Boot, Spring MVC, Spring Data JPA
			Database: MySQL
			Frontend (UI): Thymeleaf, bootstrap5
			Tools Used: Eclipse IDE, Git & GitHub, MySQL Workbench, Apache Tomcat Server, Postman
			
			- Developed a secure web application to register users and authenticate login credentials.    
			- Applied JPA and MySQL for seamless data persistence and retrieval.  
			- Designed a mobile-responsive frontend with Bootstrap and custom CSS.
			- Implemented role-based login and real-time feedback using toast messages and Thymeleaf.
		*/
		
		System.out.println("This is UserForm Practice");
		
		SpringApplication.run(UsrFormDatabaseApplication.class, args);
		
		System.out.println("Let's Connect it to DB");		
	}

}
