package com.consulting.mgt.springboot.hw2.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.consulting.mgt.springboot.hw2.client.events.ClientCreatedEventBuilder;
import com.consulting.mgt.springboot.hw2.client.model.Client;
import com.consulting.mgt.springboot.hw2.client.repository.ClientRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClientService {

	// Inyecte Bean ApplicationEventPublisher publisher
	@Autowired 
	private ApplicationEventPublisher publisher;

	@Autowired
	private ClientRepository clientRepository;

	public void createClient(Client client) {

		log.info("create client service start");
		log.info("{}",client);
		clientRepository.insert(client);
		log.info("publishing Client Created Event");
		
		// Implemente envio de evento UserCreatedEvent
		publisher.publishEvent(ClientCreatedEventBuilder.build(client));
	}
	
	public List<Client> getAllClients(){
		log.info("retrieving all clients");
		return clientRepository.findAll();
	}
}
