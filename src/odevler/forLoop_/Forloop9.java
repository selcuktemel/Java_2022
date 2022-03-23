package odevler.forLoop_;

import java.util.Scanner;

public class Forloop9 {
    public static void main(String[] args) {
        /*
Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
veya 5”in kati olan sayilari yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("100den kücük tam bir sayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 5 == 0||i%3==0) {
                System.out.println("3 ün veya 5'in kati olan sayilar " + i + " ");
            }

        }
    }
}
