package com.example.demo;

import com.example.demo.corejava;

import org.springframework.data.jpa.repository.JpaRepository;

//This interface allows Spring Data JPA to perform CRUD operations automatically.
public interface userRepo extends JpaRepository<corejava, Long> {
	//<your entity - corejava, type of the primary key >
	
	corejava findByUsername(String username);
}
