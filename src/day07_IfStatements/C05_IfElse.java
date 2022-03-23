package day07_IfStatements;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("girdiğiniz sayı çift sayidir");
       }
        else {
            System.out.println("girdiginiz sayi tek sayi");
        }
    }
}
