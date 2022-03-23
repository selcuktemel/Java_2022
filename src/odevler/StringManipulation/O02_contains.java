package odevler.StringManipulation;

import java.util.Scanner;

public class O02_contains {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle isteyin.
        // Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        String buyukHarf = "buyuk";
        String kucukHarf = "kucuk";

        if (cumle.contains(buyukHarf)) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains(kucukHarf)) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
