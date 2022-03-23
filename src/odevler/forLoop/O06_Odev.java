package odevler.forLoop;

import java.util.Scanner;

public class O06_Odev {
    public static void main(String[] args) {
        /* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
           asagidaki sekli cizdirin
           *
           * *
           * * *
           * * * *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi girin");
        int sayi1 = scanner.nextInt();

        for (int i = 0; i < sayi1; i++) { // kaç satırdan oluşacağını ve satır seçimlerini belirliyoruz.
            for (int k = 0; k <= i; k++) // Oluşmasını isdediğimiz sütunlara yıldız ataması gerçekleştiriyoruz.
                System.out.print("*");
            System.out.println("  " + (i + 1));
        }
    }
}
