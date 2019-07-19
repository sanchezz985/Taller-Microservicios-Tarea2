package com.consulting.mgt.springboot.hw2.product._config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue clientCreatedProductQueue() {
		return new Queue("clientcreated.product.queue", true);
	}
	
	// Define bean FanoutExchange fanoutExchange
	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange("productcreated.fanout");
	}
	
	// Define bean Queue productCreatedLogQueue
	@Bean
	public Queue productCreatedLogQueue() {
		return new Queue("productcreated.log.queue", true);
	}

	// Define Binding binding1
	@Bean
	public Binding binding1(FanoutExchange fanoutExchange, Queue productCreatedLogQueue) {
		return BindingBuilder.bind(productCreatedLogQueue).to(fanoutExchange);
	}
}
