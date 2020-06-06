package com.bruno.projects.barberbs.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.projects.barberbs.domain.Client;
import com.bruno.projects.barberbs.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	public Client getClient(Integer id) {
		Optional<Client> obj = clientRepository.findById(id);
		return obj.orElse(null);
	}
}
