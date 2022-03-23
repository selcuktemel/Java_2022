package odevler.odev_03;

import java.util.Scanner;

public class O05_KutsalGun {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bit gün giriniz");
        String gun =scan.next().toUpperCase();

        if (gun.equals("CUMA") ) {
            System.out.println("MUSLUMANLAR ICIN KUTSAL BIR GUN");
                    }
        else if (gun.equals("CUMARTESI") ) {
            System.out.println("YAHUDILER ICIN KUTSAL BIR GUN");

        }
        else if (gun.equals("PAZAR") ) {
            System.out.println("HRISTIYANLAR ICIN KUTSAL BIR GUN");
        }
        else {
            System.out.println("CUMA CUMARTESI PAZAR DISINDA BIR GUN SECTINIZ SECIMINIZI KONTROL EDINIZ");
        }
        scan.close();
    }
}
