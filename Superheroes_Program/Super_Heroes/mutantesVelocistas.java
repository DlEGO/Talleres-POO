package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Velocidad;

public class mutantesVelocistas implements Velocidad {
    private String manera;
    private String nombre;

    public mutantesVelocistas() {
        nombre = "mutante";
        manera = "gracias a sus poderes de mutante";
    }

    public mutantesVelocistas(String nombre, String manera) {
        this.nombre = nombre;
        this.manera = manera;
    }

    @Override
    public String correr() {
        return nombre+" se desplaza increiblemente rapido ("+manera+")";
    }

    @Override
    public String vortice() {
        return nombre+" corre en circulos creando un vortice";
    }

    @Override
    public String camaraLenta() {
        return nombre+" afina sus sentidos, para percibir el mundo en camara lenta";
    }

    @Override
    public String sobreAgua() {
        return nombre+" va tan rapido que al correr sobre el agua no se unde";
    }
}
