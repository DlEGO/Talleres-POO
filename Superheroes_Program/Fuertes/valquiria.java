package Superheroes_Program.Fuertes;

import Superheroes_Program.Fuerte;

public class valquiria extends Fuerte.abs_Fuerte{

    public valquiria() {
        nombre = "valquiria";
    }

    public valquiria(String nombre) {
        super(nombre);
    }

    @Override
    public String levantar() {
        return nombre+" flexiona las piernas y con sus dos brazos levanta algo muy pesado";
    }

    @Override
    public String defenderse() {
        return nombre+" se para firmemente, y se protege con su escudo";
    }

    @Override
    public String saltar() {
        return nombre+" se flexiona un poco y da un gigantesco salto";
    }

    @Override
    public String atacar() {
        return nombre+" empu\u00f1a su lanza, y ataca a sus enemigos con ella";
    }
}
