package Clock_Program;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,s;
        TimeUnit hora1;

        System.out.print("Digite la hora inicial: ");
        h = sc.nextInt();
        System.out.print("Digite los minutos iniciales: ");
        m = sc.nextInt();
        System.out.print("Digite los segundos iniciales: ");
        s = sc.nextInt();

        hora1 = new TimeUnit(h,m,s);
        hora1.showTime();

        System.out.print("segundos a retroceder: ");
        s = sc.nextInt();

        hora1.decreaseSecond(s);

        hora1.showTime();

        hora1.restartTime();

        hora1.showTime();


    }
}
