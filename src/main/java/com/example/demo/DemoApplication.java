package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// resolve bug de dupliicação de instancia de modulo
@SpringBootApplication
@ComponentScan({"com.*"})

public class DemoApplication {

	public static void main(String[] args) { 
		SpringApplication.run(DemoApplication.class, args);
	}

}
