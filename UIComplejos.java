import java.util.Scanner;

public class UIComplejos {
        public static double real;
        public static double imaginaria;
        static Complejos complejo;

    public static void leerDatos(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("real:");
            real = scanner.nextDouble();
            System.out.println("imaginario:");
            imaginaria = scanner.nextDouble();

            complejo = new Complejos(real,imaginaria);
    }

//    public static void mostrarMenu(){
//        Scanner scanner = new Scanner(System.in);
//        int opcion;
//        System.out.print("""
//            \t::MENU::
//            1. Sumar
//            2. restar
//            3. Multiplicar
//            4. Dividir
//            5. Norma
//            6. Conjugacion
//            0. salir
//            Opcion: """);
//        opcion = scanner.nextInt();
//
//    }

    public static void mostrarDatos(){

        System.out.println("la suma es: "+complejo.sumarComplejos()+"i");
        System.out.println("la resta es: "+complejo.restarComplejos());
        System.out.println("la resta es: " + complejo.restarComplejos() + "i");
        System.out.println("la multiplicacion es: "+complejo.multComplejos());
        System.out.println("la division es: "+complejo.divComplejos());
        System.out.println("la norma es: "+complejo.normaComplejos());
        System.out.println("la conjucion es: "+complejo.conjucionComplejos());
        System.out.println("la conjucion es: "+complejo.conjucionComplejos()+"i");

    }
}
