package com.recetario.recetario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RecetarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecetarioApplication.class, args);
	}

}
