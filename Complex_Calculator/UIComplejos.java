package Complex_Calculator;

import java.util.Scanner;

public class UIComplejos {
        public static double real;
        public static double imaginaria;
        static Complejo[] complejo = new Complejo[2];


    public static void leerDatos(){
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<2;i++){
            System.out.print("Digite parte real del complejo "+(1+i)+":");
            real = scanner.nextDouble();
            System.out.print("Digite parte imaginaria del complejo "+(1+i)+":");
            imaginaria = scanner.nextDouble();

            complejo[i] = new Complejo(real,imaginaria);
        }
        System.out.print("\nEl complejo 1 es: "+Complejo.mostrarComplejo(complejo[0]));
        System.out.println("\nEl complejo 2 es: "+Complejo.mostrarComplejo(complejo[1]));
    }

    public static void mostrarDatos(){
        System.out.println();
        System.out.println("la suma es: "+Complejo.mostrarSuma(complejo[0],complejo[1]));
        System.out.println("la resta es: "+Complejo.mostrarResta(complejo[0],complejo[1]));
        System.out.println("la multiplicacion es: "+Complejo.mostrarMultiplicacion(complejo[0],complejo[1]));
        System.out.println("la division es: "+Complejo.mostrarDivision(complejo[0],complejo[1]));
        System.out.println("la conjuncion es: "+Complejo.mostrarConjucion(complejo[0],complejo[1]));
        System.out.println("la normatividad del complejo 1 es: "+Complejo.normaComplejos(complejo[0]));
        System.out.println("la normatividad del complejo 2 es: "+Complejo.normaComplejos(complejo[1]));
    }
}
