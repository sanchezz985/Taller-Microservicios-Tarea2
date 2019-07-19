package com.consulting.mgt.springboot.hw2.log.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.log.events.ProductCreatedEvent;
import com.consulting.mgt.springboot.hw2.log.service.LogService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProductCreatedListener {

	@Autowired
	LogService logService;
	
	@SneakyThrows
	// Manejador de evento ProductCreatedEvent
	@EventListener
	public void handleProductCreatedEvent(ProductCreatedEvent pce) {
		log.info("sending Email with product details ...");

		// Implemente
		logService.sendEmail();
		
	}
}
