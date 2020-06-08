package com.bruno.projects.barberbs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bruno.projects.barberbs.domain.Client;
import com.bruno.projects.barberbs.repositories.ClientRepository;

@SpringBootApplication
public class BarberbsApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BarberbsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client a = new Client(null, "Abel Braga", "88888888");
		Client b = new Client(null, "Bruno Soares", "99999999");
		
		clientRepository.saveAll(Arrays.asList(a, b));
	}

}
