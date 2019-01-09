package controlador_action;

import excepciones.DivisionCoreExcepcion;
import modelo.OperacionesBasicas;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import servlets_form.Numeros;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OperacionesAction extends DispatchAction {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception {
        Numeros n = (Numeros) form;
        OperacionesBasicas op = new OperacionesBasicas();
        request.setAttribute("resultado", op.suma(n));
        return mapping.findForward("Basica");
    }

    public ActionForward restar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Numeros n = (Numeros) form;
        OperacionesBasicas op = new OperacionesBasicas();
        request.setAttribute("resultado", op.resta(n));
        return mapping.findForward("Basica");
    }

    public ActionForward multiplicar_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws DivisionCoreExcepcion {
        Numeros n = (Numeros) form;
        OperacionesBasicas op = new OperacionesBasicas();
        request.setAttribute("resultado", op.multiplicacion(n));
        return mapping.findForward("Basica");
    }

    public ActionForward dividir_numeros(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws DivisionCoreExcepcion {
        Numeros n = (Numeros) form;
        OperacionesBasicas op = new OperacionesBasicas();
        try {
            int valor = op.division(n);
            request.setAttribute("resultado", valor);
        } catch (Exception e) {
            throw new DivisionCoreExcepcion();
        }
        return mapping.findForward("Basica");
    }
}
