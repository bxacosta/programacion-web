package controladores_action;

import controladores_form.CategoriaForm;
import modelo.GestionProductos;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CategoriaAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena = this.getServlet().getServletContext().getInitParameter("cadena");

        CategoriaForm cb = (CategoriaForm) form;
        GestionProductos gp = new GestionProductos(driver, cadena);
        cb.setCodigoCategoria(gp.consultaCategoria());

        return mapping.findForward("categoriajsp");
    }
}
