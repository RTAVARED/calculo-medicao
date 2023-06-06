package com.rtseven.aguas.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtseven.aguas.entidades.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll() {
		Cliente c = new Cliente(1L, "Rafael", "146.523.107.22", null, "rafaeltavaresrj92@gmail.com", "21979048833");
		return ResponseEntity.ok().body(c);
	}
}
