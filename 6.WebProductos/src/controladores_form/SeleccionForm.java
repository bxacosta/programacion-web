package controladores_form;

import org.apache.struts.action.ActionForm;

public class SeleccionForm extends ActionForm {

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    private String codigoCategoria;

}
