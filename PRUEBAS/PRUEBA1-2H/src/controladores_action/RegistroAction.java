package controladores_action;

import modelo.GestionUsuario;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import servlets_form.RegisterForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistroAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena = this.getServlet().getServletContext().getInitParameter("cadena");

        GestionUsuario gc = new GestionUsuario(driver, cadena);

        RegisterForm rf = (RegisterForm) form;

        gc.registrar(rf);

        String mensaje="Datos registrados correctamente";
        request.setAttribute("message", mensaje);
        return mapping.findForward("registro");
    }

}
