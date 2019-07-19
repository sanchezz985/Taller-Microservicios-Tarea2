package com.consulting.mgt.springboot.hw2.client._config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	// Define bean FanoutExchange fanoutExchange
	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange("clientcreated.fanout");
	}
	
	// Define bean Queue userCreatedAccountQueue
	@Bean
	public Queue clientCreatedProductQueue() {
		return new Queue("clientcreated.product.queue", true);
	}

	// Define Binding binding1
	@Bean
	public Binding binding1(FanoutExchange fanoutExchange, Queue clientCreatedProductQueue) {
		return BindingBuilder.bind(clientCreatedProductQueue).to(fanoutExchange);
	}
	
}
