package controladores_form;


import org.apache.struts.action.ActionForm;

import java.util.ArrayList;

public class CategoriaForm extends ActionForm {

    private String bandera;
    private ArrayList<String> codigoCategoria;

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public ArrayList<String> getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(ArrayList<String> codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
}
