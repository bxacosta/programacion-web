package controladores_action;

import controladores_form.SeleccionCategoriaForm;
import modelo.GestionProductos;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductoAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String driver = this.getServlet().getServletContext().getInitParameter("driver");
        String cadena = this.getServlet().getServletContext().getInitParameter("cadena");
        SeleccionCategoriaForm pb = (SeleccionCategoriaForm) form;
        GestionProductos gp = new GestionProductos(driver, cadena);
        request.setAttribute("productos", gp.consultaProducto(pb.getCodigoCategoria()));

        return mapping.findForward("productojsp");
    }
}
