package odevler.forLoop;

import java.util.Scanner;

public class O05_Odev {
    public static void main(String[] args) {
        /*  Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 10'dan küçük bir tam sayi girin");
        int sayi1 = scanner.nextInt();

        int toplam = 1;
        for (int i = 1; i <=sayi1 ; i++) {

            toplam*=i;
        }
        System.out.println(toplam);


    }
}