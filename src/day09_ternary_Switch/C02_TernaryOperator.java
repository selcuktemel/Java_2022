package day09_ternary_Switch;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {
// ternary ile yapılan tüm işlemler if else ile de yapılabilr if else yerine ternary tercih etme sebebi yapının basit ve anlaşilir olmasıdır.
// ternary icerisinde komplesk kodlar olmaz bizi sonuca götüren islemler olabilir.

        // kullanıcıdan bir tam sayı alıp tek mi çift mi yazdıran bir kod yazalım

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayi1 = scan.nextInt();

        System.out.println( sayi1 %2==0 ?  "cift" : "tek");

    }
}
