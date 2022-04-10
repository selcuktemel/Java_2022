package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {
        // kullanıcıdan iki sayi alip, bolerek sonucu yazdıan bir program yaziziniz
        Scanner scan = new Scanner(System.in);
        int kontrol = 0;
        while (kontrol != 2) {

            System.out.println("Bolmek istediginiz sayiyi yaziniz.");
            int sayi = scan.nextInt();

            System.out.println("kaca bolmek istediginizi yaziniz.");
            int sayi2 = scan.nextInt();


            try {
                System.out.println("sonuc : " + sayi / sayi2);
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("girdiginiz sayilarda hata var");
            }

            System.out.println("devam etmek iin 1\n bitirmek icin 2'ye basınız");
            kontrol = scan.nextInt();
        }// hatayi versin ama calismaya devam etsin.

/*
sayi2 0 oldugunda sayi/0=tanımsız olacagından jabva bu durumla karsılasınca exception verir.
Javanın yazdıgı mesajda ecceptionun ne tur bir saun oldugu neden kaynaklandıgı ve hakgi satırda olustugu yazar.
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at C03_Exepcitions.main(C03_Exepcitions.java:13)

	bunu cozmek ici bunu if ile kontrol edebiliri.
 */
        //   if (sayi2 ==0) {
        //      System.out.println("sayi /0 tanımsızdır" );
        //  }else{
        //
        //  }

/*
ama bu yontem her soorunda calismaz
 */


    }
}
