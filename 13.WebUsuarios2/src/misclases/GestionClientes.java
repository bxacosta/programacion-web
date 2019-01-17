package misclases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestionClientes {

    Datos dt;

    public GestionClientes(String driver, String cadenacon) {
        dt = new Datos(driver, cadenacon);
    }

    public boolean validar(String user, String pwd) {
        boolean estado = false;
        try {
            Connection cn = dt.getConexion();
            String query = "SELECT * FROM cliente WHERE password = '" + pwd + "' AND usuario='" + user + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            estado = rs.next();
            dt.cierraConexion(cn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return estado;
        }
    }

}
