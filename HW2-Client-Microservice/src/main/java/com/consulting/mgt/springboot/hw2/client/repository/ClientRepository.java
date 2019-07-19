package com.consulting.mgt.springboot.hw2.client.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.consulting.mgt.springboot.hw2.client.model.Client;

@Component
public interface ClientRepository extends MongoRepository<Client, String>{}