package odevler.forLoop_;

import java.util.Scanner;

public class ForLoop92 {
    public static void main(String[] args) {

        /*
        Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("10dan kücük bir sayi giriniz");
        int sayi1 = scanner.nextInt();
        int faktoryel = 1;

        System.out.print(sayi1 + "!=");
        for (int i = sayi1; i >= 1; i--) {
            faktoryel *= i;
            System.out.print(i + "*");
        }
        System.out.println("=" + faktoryel);

    }
}
