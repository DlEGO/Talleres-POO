package Complex_Calculator_Parra;


import Complex_Calculator_Parra.Logica.Complejo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Complejo c=new Complejo();
        Complejo c1= new Complejo();
        c.leer();
        c1.leer();
        /*  Complejo d=c.suma(c1);
        d.imprimir();*/
        c.suma(c1).imprimir();
        c.resta(c1).imprimir();
        c.multiplicacion(c1).imprimir();
//        c.conjugado().imprimir();
        c.division(c1).imprimir();
    }
}

