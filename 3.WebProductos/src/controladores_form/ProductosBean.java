package controladores_form;

import java.io.Serializable;

public class ProductosBean implements Serializable {

    private Integer productoId;
    private Integer categoriaId;
    private String categoriaNombre;
    private String productoNombre;
    private Double productoStock;
    private Double productoPrecio;

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public Double getProductoStock() {
        return productoStock;
    }

    public void setProductoStock(Double productoStock) {
        this.productoStock = productoStock;
    }

    public Double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(Double productoPrecio) {
        this.productoPrecio = productoPrecio;
    }
}
