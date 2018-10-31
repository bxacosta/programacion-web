package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Datos {

    private String driver;
    private String cadena;

    public Datos() {
    }

    public Datos(String driver, String cadena) {
        this.driver = driver;
        this.cadena = cadena;
    }

    public Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(cadena, "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

    public void cierraConexion(Connection cn) {
        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
