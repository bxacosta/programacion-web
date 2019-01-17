package forms;

import java.io.Serializable;

public class ProductosBean implements Serializable {

    private Integer productoId;
    private String productoNombre;
    private Double productoStock;
    private Double productoPrecio;

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
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
