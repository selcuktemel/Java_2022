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
            System.out.println("lütfen toplamak istediğiniz sayiyi giriniz\n bitirmek icin Q ya basınız");
            int sayi = 0;
            try {
                sayi = scanner.nextInt();
            } catch (InputMismatchException e) {


            }
            toplam += sayi;
        } while (toplam < 500);


    }


}
