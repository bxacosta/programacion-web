package misclases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datos {

    private String dirver;
    private String cadena;

    public Datos(String dirver, String cadena) {
        this.dirver = dirver;
        this.cadena = cadena;
    }

    public Connection getConexion() {
        Connection cn = null;

        try {
            Class.forName(dirver).newInstance();
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
