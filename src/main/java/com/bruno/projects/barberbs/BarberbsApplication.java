package com.bruno.projects.barberbs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bruno.projects.barberbs.domain.Appointment;
import com.bruno.projects.barberbs.domain.Client;
import com.bruno.projects.barberbs.repositories.AppointmentRepository;
import com.bruno.projects.barberbs.repositories.ClientRepository;

@SpringBootApplication
public class BarberbsApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BarberbsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client a = new Client(null, "Abel Braga", "88888888");
		Client b = new Client(null, "Bruno Soares", "99999999");
		
		Appointment a1 = new Appointment(null, "13/06/2020", "09:00", a);
		Appointment a2 = new Appointment(null, "13/06/2020", "10:00", b);
		Appointment a3 = new Appointment(null, "20/06/2020", "10:00", b);
		Appointment a4 = new Appointment(null, "27/06/2020", "09:00", a);
		
		a.getAppointments().addAll(Arrays.asList(a1, a4));
		b.getAppointments().addAll(Arrays.asList(a2, a3));
		
		a1.setClient(a);
		a2.setClient(b);
		a3.setClient(b);
		a4.setClient(a);
		
		clientRepository.saveAll(Arrays.asList(a, b));
		appointmentRepository.saveAll(Arrays.asList(a1,a2,a3,a4));
	}

}
