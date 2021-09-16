package Clock_Program;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Clock reloj = new Clock(24, 60, 60);

        System.out.println(reloj);

       reloj.decreaseMinute(120);

        System.out.println(reloj);

        reloj.increaseMinute(10);

        reloj.decreaseSecond(60);

        reloj.increaseMinute(60);

        System.out.println(reloj);
//
        reloj.decreaseHour(7);

        System.out.println(reloj);

        reloj.restartTime();

        System.out.println(reloj);
    }
}
