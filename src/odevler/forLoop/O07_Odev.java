package odevler.forLoop;

import java.util.Scanner;

public class O07_Odev {
    public static void main(String[] args) {
        /* Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
           tablosu olusturun. Ornek,kullanici 3 girerse,
           1 2 3
           2 4 6
           3 6 9
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif tam sayi girin");
        int sayi1 = scanner.nextInt();


        for (int i = 1; i <= sayi1; i++) {// satır sayısını belirledik
            for(int j = 1; j <= sayi1; j++)// sutun sayısını belirledik
                System.out.print(j + (" "));
                System.out.print(i+ " ");
                System.out.println("");


        }
    }
}
