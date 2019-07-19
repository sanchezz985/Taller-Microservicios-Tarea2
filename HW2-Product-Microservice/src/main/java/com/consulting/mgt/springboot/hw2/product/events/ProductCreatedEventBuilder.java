package com.consulting.mgt.springboot.hw2.product.events;

import com.consulting.mgt.springboot.hw2.product.model.Product;

public class ProductCreatedEventBuilder {

	public static ProductCreatedEvent build(Product product) {
		return ProductCreatedEvent.builder()
				.id(product.getId())				
				.clientId(product.getClientId())
				.build();
	}
}
