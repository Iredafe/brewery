package com.dafe.brewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BreweryApplication {

	private static final Logger LOGGER = Logger.getLogger(BreweryApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(BreweryApplication.class, args);
		LOGGER.info("HEY DAFE, THE SYSTEM LAUNCHED SUCCESSFULLY...");
	}

}
