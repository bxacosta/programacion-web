package com.bxacosta.controllers;

import com.bxacosta.entities.Categoria;
import com.bxacosta.entities.Producto;
import com.bxacosta.repositories.CategoriaRepository;
import com.bxacosta.repositories.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProductoController(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/producto")
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto consultar(@PathVariable Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    @PostMapping("/categoria/{idCategoria}/producto")
    public Producto crear(@RequestBody Producto producto, @PathVariable Integer idCategoria) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(idCategoria);

        if (!categoriaOptional.isPresent()) {
            return null;
        }

        producto.setProductoId(null);
        producto.setCategoria(categoriaOptional.get());

        return productoRepository.save(producto);
    }
}
