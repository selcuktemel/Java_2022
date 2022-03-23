package odevler.odev_03;

import java.util.Scanner;

public class O04_Dikdortgen {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen iki kenar uzunluğu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();

        if (kenar1 == kenar2) {
            System.out.println("kare");
        }
        else if (kenar1 != kenar2) {
            System.out.println("dikdortgen");

        }
        else{
            System.out.println("lütfen geçerli bir değer giriniz");
        }

scan.close();
    }
}
