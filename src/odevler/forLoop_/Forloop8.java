package odevler.forLoop_;

import java.util.Scanner;

public class Forloop8 {
    public static void main(String[] args) {
        /* Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
kati olan sayilari yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("100den kücük tam bir sayi giriniz");
        int sayi=scanner.nextInt();

        for (int i = 0; i <sayi ; i++) {
            if (i%3 == 0) {
                System.out.println(i+" ");
            }


        }

    }
}
