package com.bxacosta.controllers;

import com.bxacosta.entities.Persona;
import com.bxacosta.repositories.PersonaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    private final PersonaRepository personaRepository;

    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping("/persona")
    public List<Persona> listar() {
        return personaRepository.findAll();
    }

    @GetMapping("/persona/{id}")
    public Persona consultar(@PathVariable Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @PostMapping("/persona")
    public Persona crear(@RequestBody Persona cliente) {
        cliente.setId(null);
        return personaRepository.save(cliente);
    }
}
