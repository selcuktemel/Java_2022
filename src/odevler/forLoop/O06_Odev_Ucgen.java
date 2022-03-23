package odevler.forLoop;

import java.util.Scanner;

public class O06_Odev_Ucgen {
    public static void main(String[] args) {

        // yıldızlardan bir ucgen olusturunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi girin");
        int sayi1 = scanner.nextInt();

        for (int i = 0; i < sayi1; i++) { // Üçgenimizin kaç satırdan oluşacağını ve satır seçimlerini belirliyoruz.
            for (int j = 0; j <= sayi1 - i; j++) // Üçgenimizin sütunlarına gerekli değerde boşluk atanmasını sağlıyoruz.
                System.out.print(" ");
            for (int k = 0; k <= i * 2; k++) // Üçgenimizin oluşmasını sağlayacak sütunlara yıldız ataması gerçekleştiriyoruz.
                System.out.print("*");
            System.out.println("  " + (i + 1) );
        }
    }
}

