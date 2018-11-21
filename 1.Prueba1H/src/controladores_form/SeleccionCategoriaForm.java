package controladores_form;

import org.apache.struts.action.ActionForm;

public class SeleccionCategoriaForm extends ActionForm {

    private String codigoCategoria;

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

}
