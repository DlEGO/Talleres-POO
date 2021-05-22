package Superheroes_Program.Fuertes;

import Superheroes_Program.Fuerte;

public class wookie extends Fuerte.abs_Fuerte{
    private String arma;

    public wookie() {
        nombre = "wookie";
        arma = "ballesta";
    }

    public wookie(String nombre,String arma) {
        super(nombre);
        this.arma = arma;
    }

    @Override
    public String levantar() {
        return nombre+" grita caracteristicamente, y levanta cosas pesadas con sus manos";
    }

    @Override
    public String defenderse() {
        return nombre+" se pone a cubierto";
    }

    @Override
    public String saltar() {
        return nombre+" grita caracteristicamente, flexiona las piernas y salta";
    }

    @Override
    public String atacar() {
        return nombre+" da un gran rugido y ataca con su "+arma;
    }
}
