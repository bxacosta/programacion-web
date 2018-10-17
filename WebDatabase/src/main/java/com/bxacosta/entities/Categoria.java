package com.bxacosta.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Categoria {

    @Id
    @Column(name = "categoria_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoriaId;

    @Column(name = "categoria_nombre")
    private String categoriaNombre;

    public Categoria(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }
}
