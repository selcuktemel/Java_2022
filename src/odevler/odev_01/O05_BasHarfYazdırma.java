package odevler.odev_01;

import java.util.Scanner;

public class O05_BasHarfYazdırma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen isiminizi giriniz");
        char isim =scan.next().toUpperCase().charAt(0);

        System.out.println(isim);
    }
}
