package servlets_form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class RegisterForm extends ActionForm {

    private String cedula;
    private String nombre;
    private String apellido;
    private String calificacion;
    private String email;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (!cedula.matches("[0-9]{10}")) {
            errors.add("cedula", new ActionMessage("error.cedula"));
        }

        if (!nombre.matches("[a-zA-Z]+") || !apellido.matches("[a-zA-Z]+")) {
            errors.add("nombre", new ActionMessage("error.texto"));
            errors.add("apellido", new ActionMessage("error.texto"));
        }

//        ^([1-9]\d*|0)$
        if (!calificacion.matches("[0-9]+")) {
            errors.add("calificacion", new ActionMessage("error.numero"));
        }

        if (email.indexOf("@") == -1) {
            errors.add("email", new ActionMessage("error.email"));
        }

        return errors;
    }
}
