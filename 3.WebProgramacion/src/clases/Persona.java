package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Persona {

    private String[] arreglo;
    private Connection conexion;
    private Statement statement;

    public synchronized void setArreglo(String[] nuevo) {
        arreglo = new String[nuevo.length];
        System.arraycopy(nuevo, 0, arreglo, 0, nuevo.length);
    }

    public void procedimientoConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.getConnection("jdbc:mysql://192.168.137.100:3306/prograweb", "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void procedimientoIngreso() {
        try {
            statement = conexion.createStatement();
            String query = "INSERT INTO persona(cedula, nombre, apellido, sexo) VALUE('" + arreglo[0] + "','" + arreglo[1] + "','" + arreglo[2] + "','" + arreglo[3] + "')";
            statement.executeUpdate(query);
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
