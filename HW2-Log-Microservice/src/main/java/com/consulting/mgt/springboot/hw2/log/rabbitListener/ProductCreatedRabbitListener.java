package com.consulting.mgt.springboot.hw2.log.rabbitListener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.log.events.ProductCreatedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProductCreatedRabbitListener {

	@Autowired 
	ApplicationEventPublisher publisher;

	@Autowired
	private ObjectMapper objectMapper;

	@SneakyThrows
	@RabbitListener(queues = { "#{productCreatedLogQueue.name}"})
	public void handleUserCreatedEvent(String message) {
		log.info("rabbit listener Product Created Event");
		ProductCreatedEvent pce = objectMapper.readValue(message, ProductCreatedEvent.class);
		log.info("event: {}", pce);
		log.info("publishing Product Created Event (from Log)");

		// Implemente envio de evento clientCreatedEvent		
		publisher.publishEvent(pce);
		log.info("--------------------------------------------------------------");
	}
}
