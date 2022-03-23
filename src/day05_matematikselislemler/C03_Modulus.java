package day05_matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
       //Kullanıcının verdiği sayının tek veya çift olduğunu bulunuz
        // kullanıcının verdiği sayı 5 e bölnür mü?

        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%2==0?"çift sayi":"tek sayi");
        System.out.println(sayi%5==0);

    }
}
