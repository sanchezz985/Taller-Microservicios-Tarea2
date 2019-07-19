package com.consulting.mgt.springboot.hw2.product.rabbitListener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.product.client.events.ClientCreatedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClientCreatedRabbitListener {

	@Autowired 
	ApplicationEventPublisher publisher;

	@Autowired
	private ObjectMapper objectMapper;

	@SneakyThrows
	@RabbitListener(queues = { "#{clientCreatedProductQueue.name}"})
	public void handleClientCreatedEvent(String message) {
		log.info("rabbit listener Client Created Event");
		ClientCreatedEvent cce = objectMapper.readValue(message, ClientCreatedEvent.class);
		log.info("event: {}", cce);
		log.info("publishing Client Created Event (from Product)");

		// Implemente envio de evento clientCreatedEvent		
		publisher.publishEvent(cce);
		
		
		log.info("--------------------------------------------------------------");
	}
}
