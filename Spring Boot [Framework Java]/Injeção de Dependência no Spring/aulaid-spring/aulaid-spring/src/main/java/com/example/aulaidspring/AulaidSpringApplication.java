package com.example.aulaidspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaidSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AulaidSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("OLA PESSOAL");
	}
}
