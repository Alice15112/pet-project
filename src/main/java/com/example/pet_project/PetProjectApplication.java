package com.example.pet_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class PetProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetProjectApplication.class, args);
	}

}
