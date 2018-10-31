package clases;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Persona implements HttpSessionBindingListener {

    private String numeroCedula;
    private Connection conexion = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private StringBuffer resultados;

    public Persona() {
    }

    public void valueBound(HttpSessionBindingEvent event) {
    }

    public synchronized void valueUnbound(HttpSessionBindingEvent event) {
        try {
            if (conexion != null) {
                conexion = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public synchronized void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
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

    public void procedimientoConsulta() {
        try {
            statement = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //porcentaje te permite insertar la primera parte de la cedula  y encontrar ejem:17, 172
            String query = "SELECT * from persona where cedula like '" + numeroCedula + "%'";
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String procedimientoMostrarConsulta() {
        resultados = new StringBuffer();
        try {
            resultados.append("<table border=1 cellPadding=1 cellSpacing=1 width=75 >");
            resultados.append("<tr> <td> Cedula </td>");
            resultados.append("     <td> Nombre </td>");
            resultados.append("     <td> Apellido </td>");
            resultados.append("     <td> Sexo </td> ");
            resultados.append("</tr>");
            while (resultSet.next()) {
                resultados.append("<tr>");
                resultados.append("<td>" + resultSet.getString(3) + "</td>");
                resultados.append("<td>" + resultSet.getString(4) + "</td>");
                resultados.append("<td>" + resultSet.getString(2) + "</td>");
                resultados.append("<td>" + resultSet.getString(5) + "</td>");
                resultados.append("</tr>");
            }
            resultados.append("</table>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultados.toString();
    }
}
