package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Volador;

public class liternaVerde implements Volador {

    private String nombre;

    public liternaVerde() {
        nombre = "green lantern";
    }

    public liternaVerde(String nombre) {
        this.nombre = nombre;
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
