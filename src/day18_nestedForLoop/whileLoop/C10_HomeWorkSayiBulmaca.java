package day18_nestedForLoop.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HomeWorkSayiBulmaca {
    public static void main(String[] args) {
        //bilgisayara 1-100 arasında bir sayi tutturun
        // kullanıcıdan bu sayıyı tahmin etmesini isteyin girilen her tahminde
        // sayiyi büyüt veya küçült diye kullanıcıya yok gösterin
        // kullanıcı sayiyi buldugunda kac tahiminde sayıyı buldugunu kullanıcıya yazdırın

        Random rnd = new Random();//random rastgele demek// random objesi olusturuyoruz
        int sayi = rnd.nextInt(100);// 100 ü gecmeyen bir sayi
        System.out.println(sayi);
        Scanner scan=new Scanner(System.in);

        int tahmin=0;
        int sayac=0;
        while(sayi!=tahmin){
            System.out.println("lütfen bir sayi giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi) {
                System.out.println("daha kücük bir sayi söylemelisin");

           }else if (tahmin<sayi){
                System.out.println("daha büyük sayi söylememlisin");
           }
            sayac++;
        }
        System.out.println("tuttugum sayiyi " +(sayac)+ " tahminde bildinz" );


    }
}
