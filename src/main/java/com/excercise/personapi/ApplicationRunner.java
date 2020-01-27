package com.excercise.personapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApplicationRunner {
		
	private static final Logger log = LoggerFactory.getLogger(ApplicationRunner.class);

	public static void main(String[] args) {
		log.info("Application Started");
		SpringApplication.run(ApplicationRunner.class, args);
	}

}
