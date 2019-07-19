package com.consulting.mgt.springboot.hw2.log.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	private String id;
	
	private String clientId;
}