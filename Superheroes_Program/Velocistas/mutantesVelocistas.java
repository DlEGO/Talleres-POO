package Superheroes_Program.Velocistas;

import Superheroes_Program.Velocidad;

public class mutantesVelocistas extends Velocidad.abs_Velocidad{
    private String manera;

    public mutantesVelocistas() {
        this.manera = "corre";
    }

    public mutantesVelocistas(String nombre, String manera) {
        super(nombre);
        this.manera = manera;
    }

    @Override
    public String correr() {
        return nombre+" ";
    }

    @Override
    public String vortice() {
        return null;
    }

    @Override
    public String camaraLenta() {
        return null;
    }

    @Override
    public String sobreAgua() {
        return null;
    }
}
