package misclases;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class Validacion implements ServletRequestAware, ServletContextAware {

    String pwd;
    String user;
    ServletContext context;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        pwd = request.getParameter("password");
        user = request.getParameter("username");
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }

    public String execute() throws Exception {
        String driver = context.getInitParameter("driver");
        String cadena = context.getInitParameter("cadena");
        GestionClientes gc = new GestionClientes(driver, cadena);
        if (gc.validar(user, pwd)) {
            return "ok";
        } else {
            return "error";
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
