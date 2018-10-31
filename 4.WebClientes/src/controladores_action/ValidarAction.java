package controladores_action;

import controladores_form.ValidacionForm;
import model.GestionClientes;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidarAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena = this.getServlet().getServletContext().getInitParameter("cadena");

        GestionClientes gc = new GestionClientes(driver, cadena);

        ValidacionForm vf = (ValidacionForm) form;

        if (gc.validar(vf)) {
            return mapping.findForward("bienvenida");
        } else {
            return mapping.findForward("error");
        }
    }
}
