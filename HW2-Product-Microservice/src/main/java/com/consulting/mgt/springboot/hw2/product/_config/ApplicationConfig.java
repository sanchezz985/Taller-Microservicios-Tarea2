package com.consulting.mgt.springboot.hw2.product._config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ApplicationConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
