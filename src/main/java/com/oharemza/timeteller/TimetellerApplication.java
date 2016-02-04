package com.oharemza.timeteller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TimetellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimetellerApplication.class, args);
	}
}
