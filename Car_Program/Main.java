package Car_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int rpm;
         int cilindraje;
         String tipo;
         String marca;
         String serie;
         int modelo;

         Carro carro1;
         Motor motor;

        System.out.print(":");
         rpm = sc.nextInt();
        System.out.print(":");
         cilindraje = sc.nextInt();
        System.out.print(":");
        sc.nextLine();
         tipo = sc.nextLine();

         motor = new Motor(rpm,cilindraje,tipo);

         int aux;

         aux = motor.getRpm()+motor.getCilindraje();

        System.out.print(":");
         marca = sc.nextLine();
        System.out.print(":");
         serie = sc.nextLine();
        System.out.print(":");
         modelo = sc.nextInt();

         carro1 = new Carro(marca,serie,modelo,motor);

        System.out.print(carro1);

        System.out.println("\n\n"+aux);

    }
}
