package odevler.odev_01;

import java.util.Scanner;

public class O01_IkiTamsayi {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı aolıp bunları çarp böl ve topla çıkar, bölümden kalanı bul
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriiz");
    int sayi1=scan.nextInt();
    int sayi2= scan.nextInt();
        System.out.println("sayi1+sayi2 : " +(sayi1+sayi1));
        System.out.println("sayi1-sayi2 : " +(sayi1-sayi2));
        System.out.println("sayi1*sayi2 : " +(sayi1*sayi2));
        System.out.println("sayi1/sayi2 : " +(sayi1/sayi2));
        System.out.println("sayi1%sayi2 : " +(sayi1%sayi2));
    }
}
