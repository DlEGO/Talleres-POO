package Superheroes_Program;

import Superheroes_Program.Voladores.kryptoniano;
import Superheroes_Program.Voladores.liternaVerde;
import Superheroes_Program.Voladores.mandaloriano;

public class Main {
    public static void main(String[] args) {
        Volador.abs_Volador[] heroesVoladores = new Volador.abs_Volador[3];

        heroesVoladores[0] = new kryptoniano("superman");
        heroesVoladores[1] = new liternaVerde("Hal jordan");
        heroesVoladores[2] = new mandaloriano("mando");

        System.out.println(heroesVoladores[0].despegar());
        System.out.println(heroesVoladores[1].volar());
        System.out.println(heroesVoladores[2].aterrizar());

    }
}
