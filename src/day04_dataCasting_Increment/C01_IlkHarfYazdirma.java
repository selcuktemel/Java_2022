package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_IlkHarfYazdirma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminiz giriniz");
        char ilkHarf=scan.next().charAt(0);// scan.next() bize ilk kelimeyi getiriyordu, charAt(index) bize methodu parametre olrak indexdeki char'ı bize getiri
        // String de index 0 dan başlar

        System.out.println("girdiğiniz ismin ilk harfi : " + ilkHarf);
    }
}
