package com.pizza.practika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PractikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractikaApplication.class, args);
	}

}
