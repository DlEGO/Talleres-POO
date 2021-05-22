package Superheroes_Program.Velocistas;

import Superheroes_Program.Velocidad;

public class speedForce extends Velocidad.abs_Velocidad {

    private String color;

    public speedForce(){
        nombre = "velocista";
        color = "naranja";
    }

    public speedForce(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public String correr() {
        return nombre+" corre increiblemente rapido dejando una estela electrica de color "+color;
    }

    @Override
    public String vortice() {
        return nombre+" corre velozmente en circulos, generando un vortice de color "+color;
    }

    @Override
    public String camaraLenta() {
        return nombre+" va tan rapido, que percibe el mundo en camara lenta";
    }

    @Override
    public String sobreAgua() {
        return nombre+" corre tan rapido, que puede corre sobre el agua";
    }
}
