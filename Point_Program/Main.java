package Point_Program;


import Point_Program.Logic.Point;
import Point_Program.Logic.Point3D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);
        Point p1,p2;
        Point3D p1_3d;

        System.out.println("Digite las coordenadas iniciales: ");
        System.out.print("digite x: ");
        x = sc.nextDouble();
        System.out.print("digite y: ");
        y = sc.nextDouble();
        System.out.print("digite z: ");
        z = sc.nextDouble();

        p1_3d = new Point3D(x,y,z);
        int aux;
        System.out.println(p1_3d);
        aux = sc.nextInt();
        p1_3d.up(aux);
        System.out.println(p1_3d);

        System.out.print("digite x: ");
        x = sc.nextDouble();
        System.out.print("digite y: ");
        y = sc.nextDouble();
        System.out.print("digite z: ");
        z = sc.nextDouble();

        Point3D p2_3d = new Point3D(x,y,z);
        System.out.println(p2_3d);

        System.out.println("la distancia entre los dos puntos es: "+p1_3d.distanceOtherPoint3D(p2_3d));
        System.out.println("la distancia con el origen es: "+p1_3d.distanceOrigin3D());
//        p1 = new Point(x,y);
////        p1.Up(4);
//
//
//
//        int op = 0;
//        do{
//            System.out.print("""
//                    \n\n\n\t::MENU::
//                    1. Mover arriba
//                    2. Mover abajo
//                    3. Mover derecha
//                    4. Mover izquierda
//                    5. Calcular la distancia con otro punto
//                    6. Calcular la distancia con el origen
//                    7. Mostrar las coordendas actuales
//                    0. Salir
//                    \tOpcion: """);
//            op = sc.nextInt();
//            double distance = 0;
//            String stop;
//            switch(op){
//                case 1 -> {
//                    System.out.print("Digite la distancia que quiere mover: ");
//                    distance = sc.nextDouble();
//                    p1.up(distance);
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("la nueva coordenada actual es: "+p1);
//                    op = option(op);
//                }
//                case 2 -> {
//                    System.out.print("Digite la distancia que quiere mover: ");
//                    distance = sc.nextDouble();
//                    p1.down(distance);
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("la nueva coordenada actual es: "+p1);
//                    op = option(op);
//                }
//                case 3 -> {
//                    System.out.print("Digite la distancia que quiere mover: ");
//                    distance = sc.nextDouble();
//                    p1.right(distance);
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("la nueva coordenada actual es: "+p1);
//                    op = option(op);
//                }
//                case 4 -> {
//                    System.out.print("Digite la distancia que quiere mover: ");
//                    distance = sc.nextDouble();
//                    p1.left(distance);
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("la nueva coordenada actual es: "+p1);
//                    op = option(op);
//                }
//                case 5 -> {
//                    System.out.println("\nDigite las coordenadas del segundo punto");
//                    System.out.print("digite x: ");
//                    x = sc.nextDouble();
//                    System.out.print("digite y: ");
//                    y = sc.nextDouble();
//                    p2 = new Point(x,y);
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("Punto 1: "+p1+"\tPunto 2:"+p2);
//                    System.out.println("La distancia entre los puntos es: "+p1.distanceOtherPoint(p2));
//                    op = option(op);
//                }
//                case 6 -> {
//                    System.out.println("\n\n\n\n\n\n");
//                    System.out.println("La distancia del punto "+p1+" y el origen es: "+p1.distanceOrigin());
//                    op = option(op);
//                }
//                case 7 -> {
//                    System.out.println("\n\n\n\n\n");
//                    p1.showPoint();
//                    op = option(op);
//                }
//            }
//
//        }while(op !=0);
//    }
//
//    public static int option(int op){
//        do {
//        System.out.print("""
//                \n\t1. Mostrar el menu de opciones.
//                \t0. Salir.
//                \tOPCION: """);
//        Scanner sc = new Scanner(System.in);
//        op = sc.nextInt();
//        }while(op!=1 && op!=0);
//        return op;
    }
}
