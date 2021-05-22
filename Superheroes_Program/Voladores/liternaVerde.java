package Superheroes_Program.Voladores;

import Superheroes_Program.Volador;

public class liternaVerde extends Volador.abs_Volador{

    public liternaVerde() {
        nombre = "green lantern";
    }

    public liternaVerde(String nombre) {
        super(nombre);
    }

    @Override
    public String despegar() {
        return nombre+" despega del suelo usando el poder de su anillo";
    }

    @Override
    public String volar() {
        return nombre+" vuela mediate la manipulacion de anti-gravitones con su anillo";
    }

    @Override
    public String aterrizar() {
        return nombre+" aterriza suavemente sobre el suelo irradiando una luz verde";
    }

    @Override
    public String levitar() {
        return nombre+" se mantiene facilmente en el aire usando su anillo";
    }
}
