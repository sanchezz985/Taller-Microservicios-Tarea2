package com.consulting.mgt.springboot.hw2.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.product.model.Product;

@Component
public interface ProductRepository extends MongoRepository<Product, String>{}