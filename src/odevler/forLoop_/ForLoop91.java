package odevler.forLoop_;

import java.util.Scanner;

public class ForLoop91 {
    public static void main(String[] args) {
        /* Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
toplayip, sonucu yazdiran bir program yaziniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam=0;


        for (int i = sayi1; i <=sayi2 ; i++) {
            toplam+=i;
        }System.out.println(toplam);


    }
}
