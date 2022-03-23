package odevler.odev_02;

import java.util.Scanner;

public class O04_ {
    public static void main(String[] args) {

     // 1  Kullanıcıdan iki sayı alın ve ilk sayıyı ikinci sayıya bölüp kalan ve bölümü gösteren bir program yazınız.

        Scanner scan =new Scanner (System.in);
        System.out.println("lütfen iki sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("bölüm  : "+ sayi1/sayi2 );// 8
        System.out.println("kalan  : "+ sayi1%sayi2);// 2








    }
}
