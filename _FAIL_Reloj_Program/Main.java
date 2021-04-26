package _FAIL_Reloj_Program;

import java.util.Scanner;

public class Main {

    public static int h;
    public static int m;
    public static int s;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Second sec;
        Minute min;
        Hour hour;

        System.out.print("Digite la hora inicial: ");
        h = sc.nextInt();
        System.out.print("Digite los minutos iniciales: ");
        m = sc.nextInt();
        System.out.print("Digite los segundos iniciales: ");
        s = sc.nextInt();

        sec = new Second(s);
        min = new Minute(m);
        hour = new Hour(h);

//        TimeUnit ut = new TimeUnit(sec,min,hour);
//
////        ut.increaseHour();
//        ut.showTime();

    }
}
