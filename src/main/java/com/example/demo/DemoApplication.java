package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// resolve bug de dupliicação de instancia de modulo
@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) { 
		SpringApplication.run(DemoApplication.class, args);
	}

}
