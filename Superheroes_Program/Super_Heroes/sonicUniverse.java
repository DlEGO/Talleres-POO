package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Velocidad;

public class sonicUniverse implements Velocidad {

    private String nombre;
    private String color;

    public sonicUniverse() {
        nombre = "criatura extra\u00f1a";
        this.color = "azul";
    }

    public sonicUniverse(String nombre) {
        this.nombre = nombre;
        color = "azul";
    }

    public sonicUniverse(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String correr() {
        return nombre+" corre salta y comienza a girar a toda velocidad dejando una estela de color "+color;
    }

    @Override
    public String vortice() {
        return nombre+" corre a toda valocidad se convierte en esfera y hace un vortice de color "+color;
    }

    @Override
    public String camaraLenta() {
        return nombre+" agudiza sus sentidos mueve un poco las orejas y percibe el mundo en camara lenta";
    }

    @Override
    public String sobreAgua() {
        return nombre+" va tan rapido que corre sobre el agua";
    }
}
