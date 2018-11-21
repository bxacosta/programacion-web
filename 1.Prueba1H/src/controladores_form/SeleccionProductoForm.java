package controladores_form;

import org.apache.struts.action.ActionForm;

public class SeleccionProductoForm extends ActionForm {

    private String codigoProducto;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

}
