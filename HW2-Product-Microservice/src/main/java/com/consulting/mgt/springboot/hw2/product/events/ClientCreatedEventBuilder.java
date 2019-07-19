package com.consulting.mgt.springboot.hw2.product.events;

import com.consulting.mgt.springboot.hw2.product.model.Client;

public class ClientCreatedEventBuilder {

	public static ClientCreatedEvent build(Client client) {
		return ClientCreatedEvent.builder()
				.id(client.getId())
				.name(client.getName())
				.email(client.getEmail())
				.age(client.getAge())
				.activeProduct(client.isActiveProduct())
				.idProduct(client.getIdProduct())
				.build();
	}
}
