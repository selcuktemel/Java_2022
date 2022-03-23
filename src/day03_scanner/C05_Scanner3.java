package day03_scanner;

import java.util.Scanner;

public class C05_Scanner3 {
    public static void main(String[] args) {
        //kullanıcıdan isimini ve soy ismini alıp aralarında bir boşlık bırakarak yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lürfen isiminiz giriniz");
        String isim=scan.nextLine();
        System.out.println("Lürfen soyisiminiz giriniz");
        String soyisim=scan.nextLine();
        System.out.println("isminiz soyisminiz: " + isim + " "+ soyisim);
    }
}
