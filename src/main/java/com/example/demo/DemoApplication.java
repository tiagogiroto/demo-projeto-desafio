package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// resolve bug de dupliicação de instancia de modulo
@SpringBootApplication
@ComponentScan({"com.example.demo-projeto-desafio"})
@EntityScan("com.demo-projeto-desafio")
@EnableJpaRepositories("com.demo-projeto-desafio")
public class DemoApplication {

	@Bean 
	public ModelMapper mapper(){
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setSkipNullEnabled(true);
		return mapper;

	}


	public static void main(String[] args) { 
		SpringApplication.run(DemoApplication.class, args);
	}

}
