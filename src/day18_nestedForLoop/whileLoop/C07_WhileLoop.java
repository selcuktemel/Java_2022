package day18_nestedForLoop.whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan kac sayi toplamak istediğini alın
        // ve bu sayiları toplamını ekrana yazdırın

        int sayiAdedi = 5;

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;


        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("girinlen " + sayiAdedi + " sayinin toplami : " + toplam);

        //while ile yapalım
        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi) {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("girinlen " + sayiAdedi + " sayinin toplami : " + toplam);
    }


}

