package com.bxacosta.controllers;

import com.bxacosta.entities.Cliente;
import com.bxacosta.repositories.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/cliente")
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente consultar(@PathVariable Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PostMapping("/cliente")
    public Cliente crear(@RequestBody Cliente cliente) {
        cliente.setId(null);
        return clienteRepository.save(cliente);
    }
}
