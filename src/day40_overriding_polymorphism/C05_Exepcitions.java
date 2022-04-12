package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exepcitions {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayiyi alip toplayan bir program yazınız
        // toplam 500'ü gecerse programı bitirsin veya
        // kullanıcı bitirmek istediğinde Q'ya basmalisiz

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        do {
            System.out.println("lütfen toplamak istediğiniz sayiyi giriniz\nbitirmek icin Q ya basınız");
            int sayi = 0;
            try {
                sayi = scanner.nextInt();
                toplam += sayi;
            } catch (Exception e) {
                String hataliGiris = scanner.next();
                if (hataliGiris.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("hatali giris " + e);
                }
            }
        } while (toplam < 500);
        System.out.println("girdiginiz satılaraın toplamı : " + toplam);


    }


}
