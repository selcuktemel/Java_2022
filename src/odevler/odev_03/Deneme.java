package odevler.odev_03;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

            //Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
            //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
            //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin"yazdirin,
            //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir"yazdirin.
            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen iki farklı sayı giriniz");
            System.out.println("sayi1= ");
            long sayi1 = scan.nextLong();
            System.out.println("sayi2 : ");
            long sayi2 = scan.nextLong();

            if (sayi1 > 0 && sayi2 > 0) {
                System.out.println("Sayıların Toplamı= " + (sayi1 + sayi2));

            } else if (sayi1 < 0 && sayi2 < 0) {
                System.out.println("Sayıların Çarpımı= " + (sayi1 * sayi2));

            } else if (sayi1 > 0 && sayi2 < 0 || sayi1 < 0 && sayi2 > 0) {
                System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

            } else if (sayi1 == 0 || sayi2 == 0) {
                System.out.println("sifir carpmaya gore yutan elemandir");

            }
        }
    }
