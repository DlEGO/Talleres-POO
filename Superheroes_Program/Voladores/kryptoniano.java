package Superheroes_Program.Voladores;

import Superheroes_Program.Volador;

public class kryptoniano extends Volador.abs_Volador {

    public kryptoniano() {
        nombre = "Kryptoniano";
    }

    public kryptoniano(String nombre) {
        super(nombre);
    }

    @Override
    public String despegar() {
        return nombre+" levantan un brazo y despega";
    }

    @Override
    public String volar() {
        return nombre+" crea un campo electromagnetico a voluntad, que lo permite desplazarse pr el aire";
    }

    @Override
    public String aterrizar() {
        return nombre+" aterriza en el suelo con un fuerte estruenndo";
    }

    @Override
    public String levitar() {
        return nombre+" se mantiene levitando epicamente en el aire";
    }
}
