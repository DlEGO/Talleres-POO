package Superheroes_Program.Telequineticos;

import Superheroes_Program.Telequinesis;

public class mutantePsiquico extends Telequinesis.abs_Telequinesis{

    public mutantePsiquico() {
        nombre = "mutante";
    }

    public mutantePsiquico(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerFlotar() {
        return nombre+" se enfoca en un objeto y lo hace levitar";
    }

    @Override
    public String lanzar() {
        return nombre+" se enfoca en un obejto y conforme donde mire lo lanza";
    }

    @Override
    public String empujar() {
        return nombre+" con poco esfuerzo utilizando sus poderes psiquiucos, empuja a su oponentes";
    }

    @Override
    public String destrozar() {
        return nombre+" con un esfuerzo mayor, se enfoca en su victima y la destroza con su mente";
    }
}
