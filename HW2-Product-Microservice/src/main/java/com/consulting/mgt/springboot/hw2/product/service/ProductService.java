package com.consulting.mgt.springboot.hw2.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.consulting.mgt.springboot.hw2.product.events.ProductCreatedEventBuilder;
import com.consulting.mgt.springboot.hw2.product.model.Product;
import com.consulting.mgt.springboot.hw2.product.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService {

	// Inyecte Bean ApplicationEventPublisher publisher
	@Autowired 
	private ApplicationEventPublisher publisher;

	@Autowired
	private ProductRepository productRepository;

	public void createProduct(Product product) {

		log.info("create product service start");
		productRepository.insert(product);
		log.info("publishing product created event");
		
		// Implemente envio de evento ClientCreatedEvent
		publisher.publishEvent(ProductCreatedEventBuilder.build(product));
		
	}
}
