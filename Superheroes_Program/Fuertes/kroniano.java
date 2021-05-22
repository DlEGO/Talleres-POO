package Superheroes_Program.Fuertes;

import Superheroes_Program.Fuerte;

public class kroniano extends Fuerte.abs_Fuerte{

    private String arma;

    public kroniano() {
        nombre = "kroniano";
        arma = "mazo";
    }

    public kroniano(String nombre,String arma) {
        super(nombre);
        this.arma = arma;
    }

    @Override
    public String levantar() {
        return nombre+" se agacha y con sus enormes manos de roca, levanta algo muy pesado";
    }

    @Override
    public String defenderse() {
        return nombre+" se cubre poniendo sus brazos al frente, y se vuelve invulnerable";
    }

    @Override
    public String saltar() {
        return nombre+" da un salto, pero por su cuerpo rocoso y pesado, no llega demasiado alto";
    }

    @Override
    public String atacar() {
        return nombre+" utiliza habilmente su "+arma+" para acabar con sus enemigos";
    }
}
