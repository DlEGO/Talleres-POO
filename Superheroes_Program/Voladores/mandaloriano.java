package Superheroes_Program.Voladores;

import Superheroes_Program.Volador;

public class mandaloriano extends Volador.abs_Volador {

    public mandaloriano() {
        nombre = "mandaloriano";
    }

    public mandaloriano(String nombre) {
        super(nombre);
    }

    @Override
    public String despegar() {
        return nombre+" activa su jetpack y despega";
    }

    @Override
    public String volar() {
        return nombre+" vuela utilizando su jetpack";
    }

    @Override
    public String aterrizar() {
        return nombre+" disminuye la potencia del jetpack y aterriza";
    }

    @Override
    public String levitar() {
        return nombre+ "mantiene una propulsion constante, para quedarse en un punto fijo en el aire";
    }
}
