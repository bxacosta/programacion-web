package modelo;

import controladores_form.ProductosBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionProductos {

    ConexionDB con;

    public GestionProductos(String driver, String cadena) {
        con = new ConexionDB(driver, cadena);
    }

    public ArrayList<String> consultaCategoria() {
        ArrayList<String> conjunto_categoria = new ArrayList<String>();

        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "Select categoria_id from categoria";
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                conjunto_categoria.add(rs.getString("categoria_id"));
            }
            con.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conjunto_categoria;

    }

    public ArrayList<ProductosBean> consultaProducto(String categoria_codigo) {
        ArrayList<ProductosBean> conjunto_productos = new ArrayList<ProductosBean>();
        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "select * from producto p, categoria c where p.categoria_id='" + categoria_codigo + "' and p.categoria_id=c.categoria_id";
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                ProductosBean prod = new ProductosBean();
                prod.setCategoriaId(rs.getInt("categoria_id"));
                prod.setCategoriaNombre(rs.getString("categoria_nombre"));
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

    public ArrayList<String> consultaProductoNombre(String categoria_codigo) {
        ArrayList<String> conjunto_productos = new ArrayList<String>();
        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSQL = "select producto_nombre from producto where categoria_id='" + categoria_codigo + "' ";
            ResultSet rs = st.executeQuery(cadenaSQL);
            while (rs.next()) {
                conjunto_productos.add(rs.getString("producto_nombre"));
            }
            con.cierraConexion(cn);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conjunto_productos;
    }
}
