package com.bxacosta.controllers;

import com.bxacosta.entities.Categoria;
import com.bxacosta.repositories.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/categoria")
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @PostMapping("/categoria")
    public Categoria crear(@RequestBody Categoria categoria) {
        categoria.setCategoriaId(null);
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/categoria/{id}")
    public Categoria consultar(@PathVariable Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @PutMapping("/categoria/{id}")
    public Categoria editar(@RequestBody Categoria categoria, @PathVariable Integer id) {

        if (!categoriaRepository.findById(id).isPresent()) {
            return null;
        }
        categoria.setCategoriaId(id);

        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/categoria/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaRepository.deleteById(id);
    }
}
