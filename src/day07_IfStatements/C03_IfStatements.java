package day07_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // kullanıcıdan tam sai isteyip tek veya çift oldupunu yazdırınız.
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi %2==0) {
            System.out.println("girdiğiniz sayi çifttir");

        }
        if (sayi %2!=0) {
            System.out.println("girdiğiniz sayi tektir");

        }
    }
    }


