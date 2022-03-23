package day08_IfElseIfStatement;

import java.util.Scanner;

public class C04_NestedIfElseEmekli {
    public static void main(String[] args) {
//Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yaziniz \nKadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("lütfen yasa degerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("emekli olmazsın " + (60 - yas) + " \n yıl çalısman gerek  ");
            } else {
                System.out.println("emekli olabilirsin");
            }
        }
        else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("lütfen yasa degerini kontrol edin");
            } else if (yas < 65) {
                System.out.println("emekli olmazsın " + (65 - yas) + " \n yıl çalısman gerek  ");
            } else {
                System.out.println("emekli olabilirsin");
            }
        }
        else {
            System.out.println("hatalı giriş lütfen geçerli bir giriş yapınız");
        }
    }
}
