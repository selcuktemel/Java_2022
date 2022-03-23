package odevler.forLoop_;

import java.util.Scanner;

public class Forloop3 {
    public static void main(String[] args) {
        // kullanıcıdan 100 den kücük bir tam sayi isteyin 1'den baslayrak girilen sayiya kadar 3'ün katı olan sayıları yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("100den kücük tam bir sayi giriniz");
        int sayi=scanner.nextInt();

        for (int i=1; i<=sayi; i++) {
            if (i%3 ==0) {
                System.out.print(i+" ");

            }
        }

    }
}
