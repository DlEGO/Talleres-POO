package Superheroes_Program.Telequineticos;

import Superheroes_Program.Telequinesis;

public class homoMagi extends Telequinesis.abs_Telequinesis{
    private String energia;
    public homoMagi() {
        nombre = "hechicero";
        energia = "magica";
    }

    public homoMagi(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerFlotar() {
        return nombre+" utiliza su energia "+energia+" para hacer flotar cosas";
    }

    @Override
    public String lanzar() {
        return nombre+" utiliza su energia "+energia+" para lanzar objetos";
    }

    @Override
    public String empujar() {
        return nombre+" utiliza su energia "+energia+" para empujar a sus adversarios";
    }

    @Override
    public String destrozar() {
        return nombre+" utiliza su energia "+energia+" para acabar con su adversario";
    }
}
