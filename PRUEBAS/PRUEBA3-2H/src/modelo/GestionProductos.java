package modelo;

import forms.CategoriaBean;
import forms.ProductosBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionProductos {

    ConexionDB con;

    public GestionProductos(String driver, String cadena) {
        con = new ConexionDB(driver, cadena);
    }

    public ArrayList<CategoriaBean> consultaCategorias() {
        ArrayList<CategoriaBean> conjunto_categorias = new ArrayList<>();

        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "SELECT * FROM categoria";
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                CategoriaBean categoriaBean = new CategoriaBean();
                categoriaBean.setId(rs.getInt("categoria_id"));
                categoriaBean.setNombre(rs.getString("categoria_nombre"));
                conjunto_categorias.add(categoriaBean);
            }
            con.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conjunto_categorias;
    }

    public ArrayList<ProductosBean> consultaProducto(Integer id) {
        ArrayList<ProductosBean> conjunto_productos = new ArrayList<ProductosBean>();
        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "SELECT * FROM producto where categoria_id=" + id;
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                ProductosBean prod = new ProductosBean();
                prod.setProductoId(rs.getInt("producto_id"));
                prod.setProductoNombre(rs.getString("producto_nombre"));
                prod.setProductoPrecio(rs.getDouble("producto_precio"));
                prod.setProductoStock(rs.getDouble("producto_stock"));
                conjunto_productos.add(prod);
            }
            con.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conjunto_productos;
    }
}
