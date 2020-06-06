package com.bruno.projects.barberbs.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {

	@GetMapping
	public String list() {
		return "REST works!";
	}
}
