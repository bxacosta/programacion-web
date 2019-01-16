package modelo;

import servlets_form.RegisterForm;

import java.sql.Connection;
import java.sql.Statement;

public class GestionUsuario {

    ConexionDB con;

    public GestionUsuario(String driver, String cadena) {
        con = new ConexionDB(driver, cadena);
    }

    public void registrar(RegisterForm rf) {

        String query = "INSERT INTO prueba(cedula, nombre, apellido, calificacion, email) VALUES ";
        query += "('" + rf.getCedula() + "','" + rf.getNombre() + "','" + rf.getApellido() + "','" + rf.getCalificacion() + "','" + rf.getEmail() + "')";

        try {
            int i;
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            i = st.executeUpdate(query);
            st.close();
            con.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
