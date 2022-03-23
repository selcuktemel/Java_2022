package day18_nestedForLoop.whileLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {// ForLoop Vs WhileLoop

    public static void main(String[] args) {
        //kullanıcıdan toplamak istediği sayıları alın ve kullanıcı 0 a basıncaya kadar devam edin kullanıcı
        // 0 a bastıgında girdiği tüm sayıların toplamını yazıdırn

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
/*
        for (int i = 1; i <= 100000; i++) {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;// loop u bitirecek

            } else { //o sayıyı toplama ekleyecek
                toplam += sayi;
            }
        }
        System.out.println(toplam);
*/

        sayi = 1;
        toplam = 0;

        while (sayi != 0) {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println(toplam);
// baslangıc, bitis ve degisim degerleri net olan durumlarda FOR LOOP daha avantajlıdır.
// AMA ADIM SAYISI OLMAYAN durumlarda while loop daha avantajlıdır.

    }

}
