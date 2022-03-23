package day18_nestedForLoop.whileLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {
        //kullanıcıdan istedigi kadar sayi girmesini isteyin kullanıcının
        // girdiği sayiların toplamı 500 ü gecerse artık yeter çok sayi girdin toplam .... oldu yazsın

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        while (toplam<500){
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println( "artık yeter çok sayi girdin toplamı: " +toplam+   " oldu");

    }
}
