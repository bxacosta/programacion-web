package controladores_action;

import controladores_form.ValidacionForm;
import modelo.OperacionesBasicas;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperacionAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{

        OperacionesBasicas op=new OperacionesBasicas();
        ValidacionForm vf=(ValidacionForm)form;
        request.setAttribute("respuesta", op.suma(vf));
        return mapping.findForward("resultado");

    }
}
