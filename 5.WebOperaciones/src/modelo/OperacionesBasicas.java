package modelo;

import controladores_form.ValidacionForm;

public class OperacionesBasicas {

    public int suma(ValidacionForm vf){
        return(Integer.parseInt(vf.getNumero1())+Integer.parseInt(vf.getNumero2()));
    }
}