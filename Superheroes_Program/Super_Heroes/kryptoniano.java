package Superheroes_Program.Super_Heroes;

import Superheroes_Program.Fuerte;
import Superheroes_Program.Velocidad;
import Superheroes_Program.Volador;

public class kryptoniano implements Volador, Fuerte, Velocidad {

    private String nombre;

    public kryptoniano(){
        nombre = "kryptoniano";
    }

    public kryptoniano(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String despegar() {
        return nombre+" levantan un brazo y despega";
    }

    @Override
    public String volar() {
        return nombre+" crea un campo electromagnetico a voluntad, que lo permite desplazarse pr el aire";
    }

    @Override
    public String aterrizar() {
        return nombre+" aterriza en el suelo con un fuerte estruenndo";
    }

    @Override
    public String levitar() {
        return nombre+" se mantiene levitando epicamente en el aire";
    }

    @Override
    public String levantar() {
        return nombre+" con una mano, y sin esfuerzo levanta algo muy pesado";
    }

    @Override
    public String defenderse() {
        return nombre+" no se defiende, y aprovecha para contraatacar";
    }

    @Override
    public String saltar() {
        return nombre+" salta desde el piso con un gran estruendo";
    }

    @Override
    public String atacar() {
        return nombre+" da un clasico pu\u00f1o con una inmensa fuerza";
    }

    @Override
    public String correr() {
        return nombre+" corre a una increible velocidad dejando una estela roja";
    }

    @Override
    public String vortice() {
        return nombre+" corre en circulos formando un vortice de color rojo";
    }

    @Override
    public String camaraLenta() {
        return nombre+" agudiza sus sentidos y percibe el mundo en camara lenta";
    }

    @Override
    public String sobreAgua() {
        return nombre+" prefiere no mojarse y en vez de correr sobre el agua, vuela sobre ella";
    }
}
