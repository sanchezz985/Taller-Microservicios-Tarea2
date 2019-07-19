package com.consulting.mgt.springboot.hw2.log._config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue productCreatedLogQueue() {
		return new Queue("productcreated.log.queue", true);
	}

}
