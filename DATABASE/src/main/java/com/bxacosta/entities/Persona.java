package com.bxacosta.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Persona {

    @Id
    @Column(name = "persona_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String cedula;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String sexo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
}
