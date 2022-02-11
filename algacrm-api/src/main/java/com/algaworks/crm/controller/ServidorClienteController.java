package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;

//controlador Rest
@RestController

//Mapea os end ponts
@RequestMapping("/clientes")
public class ServidorClienteController {
	
	//Estancia uma implementação que vem da interface 
	@Autowired
	private ClienteRepository clienteRepository;
	
	//Mapeamento do metodo verbo HTPP get
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	//Mapeamento do metodo verbo HTPP post
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Cliente cliente) {
		 clienteRepository.delete(cliente);
	}
}
