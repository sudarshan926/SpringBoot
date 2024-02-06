package com.fusion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestFullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFullApiApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		System.out.println("Inside getRestTemplate()--");
		return new RestTemplate();
	}
}
