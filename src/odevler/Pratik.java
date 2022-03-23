package odevler;

import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner( System.in);
        System.out.println("LÜTFEN 4 BASAMAKLI BİR SAYI GİRİNİZ");
        int sayi=scan.nextInt();
        int toplam=0;

//1453 için
        toplam +=sayi%10; //3
        System.out.println(sayi/=10);

        toplam+=sayi%10;//3+5
        System.out.println(sayi/=10);

        toplam+=sayi%10;//3+5+4
        System.out.println(sayi/=10);

        toplam+=sayi%10;//3+5+4+1
        System.out.println(toplam);
        int y = 1;
        int z = 1;
        int a = y<10 ? y++ : z++;
        System.out.println(y + "“,”" + z + "“,”" + a);



    }
}
