package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("43 99999-2222");
		cliente1.setEmail("joaodasilva@algaworks.com");
		
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 97777-1111");
		cliente2.setEmail("mariadascouves@algaworks.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
