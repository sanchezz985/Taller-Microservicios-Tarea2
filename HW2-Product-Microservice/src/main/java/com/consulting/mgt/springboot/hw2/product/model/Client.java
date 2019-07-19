package com.consulting.mgt.springboot.hw2.product.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

	@Id
	private String id;

	private String name;

	private String email;

	private int age;
	
	private boolean activeProduct;
	
	// optional
	private int idProduct;
	
}