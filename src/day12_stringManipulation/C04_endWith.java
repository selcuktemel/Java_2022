package day12_stringManipulation;

import java.util.Scanner;

public class C04_endWith {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("litfen mail adresini giriniz");
        String mail = scanner.next().toLowerCase();

        String arananMetin="@gmail.com";

        if(!mail.contains(arananMetin)){ //mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            System.out.println("lutfen gmail adresi giriniz");
        }
        else if(mail.endsWith(arananMetin)){ // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “
            System.out.println("Email adresiniz kaydedildi");
        }
        else {
            System.out.println("lutfen yazimi kontol edin");
        }



    }
}
