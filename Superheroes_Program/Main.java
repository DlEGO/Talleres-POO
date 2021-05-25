package Superheroes_Program;

import Superheroes_Program.Super_Heroes.kroniano;
import Superheroes_Program.Super_Heroes.jedi;
import Superheroes_Program.Super_Heroes.sonicUniverse;

public class Main {
    public static void main(String[] args) {

        SuperHeroes[] superheroes = new SuperHeroes[3];

        superheroes[0] = new kroniano("kor","acha");
        superheroes[1] = new jedi("anakin");
        superheroes[2] = new sonicUniverse("shadow","negro");


        System.out.println(superheroes[0].atacar());
        System.out.println(superheroes[1].destrozar());
        System.out.println(superheroes[2].correr());
    }
}
