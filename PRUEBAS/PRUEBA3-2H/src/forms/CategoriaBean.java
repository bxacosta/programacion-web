package forms;

import java.io.Serializable;

public class CategoriaBean implements Serializable {

    private Integer id;
    private String nombre;

    public CategoriaBean() {
    }

    public CategoriaBean(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
