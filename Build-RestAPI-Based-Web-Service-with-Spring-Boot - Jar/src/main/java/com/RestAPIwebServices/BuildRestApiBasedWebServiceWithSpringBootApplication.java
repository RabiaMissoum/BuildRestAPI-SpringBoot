package com.RestAPIwebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.controller", "com.services"})
public class BuildRestApiBasedWebServiceWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildRestApiBasedWebServiceWithSpringBootApplication.class, args);
	}

}
