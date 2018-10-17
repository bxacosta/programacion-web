package com.bxacosta.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;

    @Column(name = "producto_nombre")
    private String productoNombre;

    @Column(name = "producto_precio")
    private Double productoPrecio;

    @Column(name = "producto_stock")
    private Double productoStock;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
