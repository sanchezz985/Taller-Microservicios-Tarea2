package com.consulting.mgt.springboot.hw2.log.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreatedEvent {

	public String id;
	
	public String clientId;

}
