package com.consulting.mgt.springboot.hw2.product.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductCreatedEvent {

	public String id;
	
	public String clientId;

}
