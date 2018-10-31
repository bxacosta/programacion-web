package controladores_action;

import controladores_form.RegistroForm;
import controladores_form.ValidacionForm;
import model.GestionClientes;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegitrarAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena = this.getServlet().getServletContext().getInitParameter("cadena");

        GestionClientes gc = new GestionClientes(driver, cadena);

        RegistroForm rf = (RegistroForm) form;

        gc.registrar(rf);

        return mapping.findForward("login");
    }
}
