package com.bxacosta.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
public class Prueba {

    @Id
    @Column(name = "prueba_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String cedula;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String calificacion;
    @Column
    private String email;

    public Prueba(String cedula, String nombre, String apellido, String calificacion, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.email = email;
    }
}
