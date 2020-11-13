package com.example.Clientes.ApiClientes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/clientes")
public class ClientesController {
	
	@GetMapping
	public String hello() {
		return "FOOOOI";
	}

}
