package servlets_form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class RegisterForm extends ActionForm {

    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String passwordRep;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRep() {
        return passwordRep;
    }

    public void setPasswordRep(String passwordRep) {
        this.passwordRep = passwordRep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (usuario == null || usuario.isEmpty()) {
            errors.add("usuario", new ActionMessage("error.usuario"));
        }

        if (password == null || password.isEmpty()) {
            errors.add("password", new ActionMessage("error.password"));
        }

        if (!password.equals(passwordRep)) {
            errors.add("passwordrep", new ActionMessage("error.password.rep"));
        }

        if (email.indexOf("@") == -1) {
            errors.add("email", new ActionMessage("error.email"));
        }
        return errors;
    }
}
