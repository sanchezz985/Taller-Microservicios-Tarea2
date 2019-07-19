package com.consulting.mgt.springboot.hw2.product.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.product.client.events.ClientCreatedEvent;
import com.consulting.mgt.springboot.hw2.product.model.Product;
import com.consulting.mgt.springboot.hw2.product.service.ProductService;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClientCreatedListener {

	@Autowired
	ProductService productService;
	
	@SneakyThrows
	// Manejador de evento ClientCreatedEvent
	@EventListener
	public void handleClientCreatedEvent(ClientCreatedEvent cce) {
		log.info("catching Client Created Event {}", cce);

		// Implemente
		if(cce.isActiveProduct()) {
			Product product = new Product();
			product.setClientId(cce.getId());			
			productService.createProduct(product);
		}
		
		log.info("--------------------------------------------------------------");
	}
}
