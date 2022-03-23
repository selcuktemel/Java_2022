package odevler.forLoop_;

import java.util.Scanner;

public class forLoop_ {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
tablosu olusturun. Ornek,kullanici 3 girerse,
1 2 3
2 4 6
3 6 9
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir rakam giriniz");
        int sayi1 = scanner.nextInt();

        for (int i = 1; i <=sayi1 ; i++) {
            for (int j = 1; j <=sayi1; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
