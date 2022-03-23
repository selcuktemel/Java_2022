package odevler.odev_03;

import java.util.Scanner;

public class O02_GunIsmi {
    public static void main(String[] args) {
        /*Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        isimlerini yazdirin
        Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali”
*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='P') {
            System.out.println("PAZARTESİ, PERSEBMBE,PAZAR");
        }
        else if (ilkHarf=='S'){
            System.out.println("SALI");
        }
        else if (ilkHarf=='C'){
            System.out.println("CARSAMBA, CUMA, CUMARTESI");
        }
        else {
            System.out.println("lütfen geçerli bir harf giriniz");
        }
scan.close();
    }
}
