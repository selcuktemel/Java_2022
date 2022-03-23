package odevler.odev_03;

import java.util.Scanner;

public class O01_TekCiftSayi {
    public static void main(String[] args) {
       // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bri tam sayı giriniz");
       int sayi=scan.nextInt();

        if (sayi%2==0 ) {
            System.out.println(sayi + " sayisi çift sayıdır");

        }
        if (sayi%2!=0) {
            System.out.println(sayi+ " sayisi tek sayidir");

        }



    }
}
