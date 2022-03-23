package odevler.StringManipulation;

import java.util.Scanner;

public class contains {// karakterleri içerip içermediğii verecek index vermeyecek. char içermez, true vey false verir.
    public static void main(String[] args) {
        //kullanıcıdan mail adresini girmesini isteyin
        // mail @hotmail.com içermiyorsa "lütfen gecerli bir mail giriniz ",
        // hotmail.com ile bitiyorsa "mail adresiniz kaydedildi "
        //hotmail.com ile bitmiyorsa "lütfen yazımınızı kontrol ediniz" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresini giriniz");
        String mail=scanner.next();

        String arananMetin="@hotmail.com";
        System.out.println((arananMetin+ "'un uzunlugu "+ arananMetin.length()));// @hotmail.com'in uzunlugu 12 olarak bulur bu sabittir.
        System.out.println((mail+ "'in içindeki "+ arananMetin+ "'in sayılmaya basladıgı uzunluk "+ (mail.length()-12)));
        // .....@hotmail.com'in içindeki @hotmail.com'in uzunlugu 6

       if(!mail.contains(arananMetin)){//  aranan kelimeyi içermiyorsa
            System.out.println("lütfen gecerli bir mail giriniz ");
        }else if(mail.lastIndexOf(arananMetin)==(mail.length()-12)){


            System.out.println("mail adresiniz kaydedildi ");
        }
        else{
            System.out.println("lütfen yazımınızı kontrol ediniz");
        }


    }
}
