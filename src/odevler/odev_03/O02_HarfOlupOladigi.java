package odevler.odev_03;

import java.util.Scanner;

public class O02_HarfOlupOladigi {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin
         Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);

        if ((karakter >= 'a' && karakter <= 'z')||(karakter >= 'A' && karakter <= 'Z')) {
            System.out.println("girilen karakter harf");
        } else {
            System.out.println("girdiğiniz karekter harf değil");
        }


    }
}
