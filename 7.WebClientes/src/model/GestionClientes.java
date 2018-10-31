package model;

import controladores_form.RegistroForm;
import controladores_form.ValidacionForm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestionClientes {

    private Datos datos;

    public GestionClientes(String driver, String cadena) {
        datos = new Datos(driver, cadena);
    }

    public boolean validar(ValidacionForm vf) {

        boolean estado = false;
        try {
            Connection cn = datos.getConexion();
            String query = "Select * from cliente ";
            query += "WHERE password= '" + vf.getPassword();
            query += "' AND usuario='" + vf.getUsuario() + "'";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            estado = rs.next();

            datos.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

    public void registrar(RegistroForm rf) {

        String query = "INSERT INTO cliente(nombre, apellido, usuario, password, email) VALUES ";
        query += "('" + rf.getNombre() + "','" + rf.getApellido() + "','" + rf.getUsuario() + "','" + rf.getPassword() + "','" + rf.getEmail() + "')";

        try {
            int i;
            Connection cn = datos.getConexion();
            Statement st = cn.createStatement();
            i = st.executeUpdate(query);
            st.close();
            datos.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
