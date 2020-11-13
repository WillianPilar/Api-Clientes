package com.example.Clientes.ApiClientes.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Clientes.ApiClientes.Model.Clientes;
import com.example.Clientes.ApiClientes.Service.ClientesService;

@RestController
@RequestMapping(value="/api/clientes")
public class ClientesController {
		
	@Autowired
	public ClientesService clientesService;
	
	@GetMapping
	public List<Clientes> getAllClientes() {
		return clientesService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Clientes> getClienteById(@PathVariable int id) {
		return clientesService.getById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes createCliente(@RequestBody Clientes cliente) {
		return clientesService.create(cliente);
	}

}
