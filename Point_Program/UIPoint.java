package Point_Program;

import Point_Program.Logic.Line;
import Point_Program.Logic.Point;
import Point_Program.Logic.Point3D;

import java.util.Scanner;

import static java.lang.System.exit;

public interface UIPoint {

    static void menuSelect(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("""
                \t::SELECCION DE MENU::
                1. Punto en 2 dimensiones
                2. Punto en 3 dimensiones
                3. Linea en un plano
                O. Salir
                \tOpcion: """);
        op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    menuPoint();
                    op = optionMenu();
                    if(op == 1){
                        menuSelect();
                    }else if(op == 0){
                        exit(0);
                    }
                }
                case 2 -> {
                    menuPoint3D();
                    op = optionMenu();
                    if(op == 1){
                        menuSelect();
                    }else if(op == 0){
                        exit(0);
                    }
                }
                case 3 -> {
                    menuLine();
                    op = optionMenu();
                    if(op == 1){
                        menuSelect();
                    }else if(op == 0){
                        exit(0);
                    }
                }
                case 0 -> exit(0);
                default -> menuSelect();
            }
    }

    static void menuPoint(){
        double x;
        double y;
        Scanner sc = new Scanner(System.in);
        Point p1,p2;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t::PUNTO EN 2D::\n");
        System.out.println("Digite las coordenadas iniciales: ");
        System.out.print("digite x: ");
        x = sc.nextDouble();
        System.out.print("digite y: ");
        y = sc.nextDouble();

        p1 = new Point(x,y);
//        p1.Up(4);



        int op = 0;
        do{
            System.out.print("""
                    \n\n\n\t::MENU::
                    1. Mover arriba
                    2. Mover abajo
                    3. Mover derecha
                    4. Mover izquierda
                    5. Calcular la distancia con otro punto
                    6. Calcular la distancia con el origen
                    7. Mostrar las coordendas actuales
                    0. Return
                    \tOpcion: """);
            op = sc.nextInt();
            double distance = 0;
            switch(op){
                case 1 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1.up(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1);
                    op = option();
                }
                case 2 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1.down(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1);
                    op = option();
                }
                case 3 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1.right(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1);
                    op = option();
                }
                case 4 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1.left(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1);
                    op = option();
                }
                case 5 -> {
                    System.out.println("\nDigite las coordenadas del segundo punto");
                    System.out.print("digite x: ");
                    x = sc.nextDouble();
                    System.out.print("digite y: ");
                    y = sc.nextDouble();
                    p2 = new Point(x,y);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Punto 1: "+p1+"\tPunto 2:"+p2);
                    System.out.println("La distancia entre los puntos es: "+p1.distanceOtherPoint(p2));
                    op = option();
                }
                case 6 -> {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("La distancia del punto "+p1+" y el origen es: "+p1.distanceOrigin());
                    op = option();
                }
                case 7 -> {
                    System.out.println("\n\n\n\n\n\n\n");
                    p1.showPoint();
                    op = option();
                }
            }

        }while(op !=0);

    }

    static void menuPoint3D(){
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);
        Point3D p1_3d,p2_3d;

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t::PUNTO EN 3D::\n");
        System.out.println("Digite las coordenadas iniciales: ");
        System.out.print("digite x: ");
        x = sc.nextDouble();
        System.out.print("digite y: ");
        y = sc.nextDouble();
        System.out.print("digite z: ");
        z = sc.nextDouble();

        p1_3d = new Point3D(x,y,z);

        int op = 0;
        do{
            System.out.print("""
                    \n\n\n\t::MENU::
                    1. Mover arriba
                    2. Mover abajo
                    3. Mover derecha
                    4. Mover izquierda
                    5. Aumentar en eje z
                    6. Disminuir en eje z
                    7. Calcular la distancia con otro punto
                    8. Calcular la distancia con el origen
                    9. Mostrar las coordendas actuales
                    0. Return
                    \tOpcion: """);
            op = sc.nextInt();
            double distance = 0;
            switch(op){
                case 1 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.up(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 2 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.down(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 3 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.right(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 4 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.left(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 5 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.increaseZ(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 6 ->{
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    p1_3d.decreaseZ(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+p1_3d);
                    op = option();
                }
                case 7 -> {
                    System.out.println("\nDigite las coordenadas del segundo punto");
                    System.out.print("digite x: ");
                    x = sc.nextDouble();
                    System.out.print("digite y: ");
                    y = sc.nextDouble();
                    System.out.print("digite z: ");
                    z = sc.nextDouble();
                    p2_3d = new Point3D(x,y,z);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Punto 1: "+p1_3d+"\tPunto 2:"+p2_3d);
                    System.out.println("La distancia entre los puntos es: "+p1_3d.distanceOtherPoint3D(p2_3d));
                    op = option();
                }
                case 8 -> {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("La distancia del punto "+p1_3d+" y el origen es: "+p1_3d.distanceOrigin3D());
                    op = option();
                }
                case 9 -> {
                    System.out.println("\n\n\n\n\n\n");
                    p1_3d.showPoint3D();
                    op = option();
                }
            }
        }while(op !=0);
    }

    static void menuLine(){
        Scanner sc = new Scanner(System.in);
        Point initPoint,endPoint;

        double x1,y1;
        double x2,y2;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t::Linea::\n");
        System.out.println("Digite las coordenadas del punto de inicio");
        System.out.print("x: ");
        x1 = sc.nextDouble();
        System.out.print("y: ");
        y1 = sc.nextDouble();
        System.out.println("Digite las coordenadas del punto final");
        System.out.print("x: ");
        x2 = sc.nextDouble();
        System.out.print("y: ");
        y2 = sc.nextDouble();

        initPoint = new Point(x1,y1);
        endPoint = new Point(x2,y2);

        Line line = new Line(initPoint,endPoint);

        int op;
        do{
            System.out.print("""
                    \n\n\n\t::MENU::
                    1. Mover linea arriba
                    2. Mover linea abajo
                    3. Mover linea derecha
                    4. Mover linea izquierda
                    5. Calcular la longitud de la linea
                    6. Mostrar las coordendas de la linea
                    0. Return
                    \tOpcion: """);
            op = sc.nextInt();
            double distance;
            switch(op){
                case 1 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    line.upLine(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+line);
                    op = option();
                }
                case 2 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    line.downLine(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+line);
                    op = option();
                }
                case 3 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    line.rightLine(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+line);
                    op = option();
                }
                case 4 -> {
                    System.out.print("Digite la distancia que quiere mover: ");
                    distance = sc.nextDouble();
                    line.leftLine(distance);
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("la nueva coordenada actual es: "+line);
                    op = option();
                }
                case 5 -> {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Punto inicial: "+line.getInitPoint()+"\tPunto final: "+line.getEndPoint());
                    System.out.println("La distancia entre los puntos es: "+line.lineLength());
                    op = option();
                }
                case 6 -> {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Las cordenadas del segemnto son: "+line);
                    op = option();
                }
            }
        }while(op!=0);
    }

    static int optionMenu(){
        int op;
        do {
            System.out.print("""
                \n\t1. Seleccionar otro menu.
                \t0. Salir.
                \tOPCION: """);
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
        }while(op !=1 && op !=0);
        return op;
    }

    static int option(){
        int op;
        do {
            System.out.print("""
                \n\t1. Mostrar el menu de opciones.
                \t0. Return.
                \tOPCION: """);
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
        }while(op !=1 && op !=0);
        return op;
    }


}
