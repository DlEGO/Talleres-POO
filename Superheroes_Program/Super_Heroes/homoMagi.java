package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Telequinesis;

public class homoMagi implements Telequinesis {
    private String energia;
    private String nombre;

    public homoMagi() {
        nombre = "hechicero";
        energia = "magica";
    }

    public homoMagi(String nombre, String energia) {
        this.nombre = nombre;
        this.energia = energia;
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
