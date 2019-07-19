package com.consulting.mgt.springboot.hw2.client.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulting.mgt.springboot.hw2.client.model.Client;
import com.consulting.mgt.springboot.hw2.client.service.ClientService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping("clients")
	public String postClient(@RequestBody Client client) {

		clientService.createClient(client);

		// TODO: change this
		return "{}";
	}
	
	@GetMapping("clients")
	public List<Client> getClients(){	
		return clientService.getAllClients();
	}
	
}
