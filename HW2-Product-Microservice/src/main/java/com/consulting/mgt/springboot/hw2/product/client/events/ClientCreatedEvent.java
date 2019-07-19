package com.consulting.mgt.springboot.hw2.product.client.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientCreatedEvent {

	private String id;

	private String name;

	private String email;

	private int age;
	
	private boolean activeProduct;
	
	// optional
	private int idProduct;
	
}
