package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation3 {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime üç harften kısa ise "kelime cok kısa" yazdırın
        //eger kelime 3,4veya 5 harfli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        // eger 5 harften uzunsa "kelime cok uzun "yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scanner.next();

        int harfSayisi = kelime.length();

        if (harfSayisi < 3) {
            System.out.println("kelime cok kısa");
        } else if (harfSayisi == 3) {
            ucharfiTersineCevir(kelime);
        } else if (harfSayisi == 4) {
            dortharfiTersineCevir(kelime);
        } else if (harfSayisi == 5) {
            besharfiTersineCevir(kelime);
        } else {
            System.out.println("kelime çok uzun");
        }
    }

    // 1- method olusturmak icin methodun adını yazarız
    // 2- methoda giderken goturmem gereken variable varsa bunu methoda eklemeliyim.
    private static void besharfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
    }

    private static void dortharfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
    }

    private static void ucharfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
    }


}
