package com.bruno.projects.barberbs.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.projects.barberbs.domain.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {

	@GetMapping
	public List<Client> list() {
		
		Client a = new Client(1, "Bruno Soares", "987654321");
		Client b = new Client(2, "Rodrigo Soares", "987654322");
		
		List<Client> clients = new ArrayList<>(); 
		clients.add(a);
		clients.add(b);
		
		return clients;
	}
}
