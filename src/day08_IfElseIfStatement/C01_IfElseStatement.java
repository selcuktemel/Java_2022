package day08_IfElseIfStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karakter =scan.next().charAt(0);

        if ((karakter >='A'&& karakter <='Z') ||(karakter >='a'&& karakter <='z') ) {
            System.out.println("girdiğiniz karakter harftir");

        }
        else{
            System.out.println("girdiğiniz karakter harf değil");
        }

    }
}
