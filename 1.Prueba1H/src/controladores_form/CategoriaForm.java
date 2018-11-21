package controladores_form;

import org.apache.struts.action.ActionForm;

import java.util.ArrayList;

public class CategoriaForm extends ActionForm {

    private ArrayList<String> codigoCategoria;

    public ArrayList<String> getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(ArrayList<String> codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
}
