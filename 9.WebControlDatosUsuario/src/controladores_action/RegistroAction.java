package controladores_action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistroAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        String mensaje = "Datos validados en la clase RegistroForm, antes de ser enviados al modelo ...";
        request.setAttribute("mensaje", mensaje);
        return mapping.findForward("Registro");
    }

}
