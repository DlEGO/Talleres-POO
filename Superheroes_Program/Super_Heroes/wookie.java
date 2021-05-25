package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Fuerte;

public class wookie implements Fuerte {
    private String arma;
    private String nombre;

    public wookie() {
        nombre = "wookie";
        arma = "ballesta";
    }

    public wookie(String nombre,String arma) {
        this.nombre = nombre;
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
