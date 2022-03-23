package odevler.odev_01;

import java.util.Scanner;

public class O02_Kare {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen karenin bir kenar uzunluğunu giriniz");
        double kare =scan.nextDouble();

        System.out.println("(4*a)karenin çevresi :" + (4*kare));
        System.out.println("(a*a) karenin alanı  :" + (kare*kare));
    }
}
