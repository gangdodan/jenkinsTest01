package com.example.deploymomotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DeploymomotestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymomotestApplication.class, args);
	}

}
