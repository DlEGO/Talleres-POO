package Superheroes_Program.Telequineticos;

import Superheroes_Program.Telequinesis;

public class jedi extends Telequinesis.abs_Telequinesis {

    public jedi() {
        nombre = "jedi";
    }

    public jedi(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerFlotar() {
        return nombre+" extiende la mano hacia el objeto, y lo hace flotar con el poder de la fuerza";
    }

    @Override
    public String lanzar() {
        return nombre+" observa el objeto, y lo lanza utilizando solo su mente";
    }

    @Override
    public String empujar() {
        return nombre+" extiende el brazo hacia al frente con la mano abierta, y empuja a su adversario";
    }

    @Override
    public String destrozar() {
        return nombre+" cierra la mano con fuerza, y comprime el objeto en el que esta enfocado";
    }
}
