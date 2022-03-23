package day12_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("litfen mail adresini giriniz");
        String mail = scanner.next().toLowerCase();

        String arananMetin="@gmail.com";

        if (!mail.contains(arananMetin)){// ünlem ile arananMetin'i içermiyorsa yaptık
            System.out.println("lütfen gmail adresini giriniz");
        } else if (mail.lastIndexOf(arananMetin)                 ==     (mail.length()-10)){// arananMetin ile bitiyorsa, @gmail.com'un uzunluğu sabit (mailin uzunluğu-10(@gmail.com)) geriden itibaren sayıyoruz ve 10 indeks sonra
             // (gmail.com 'un son kullanımının indeksini verecek)      (mail uzunlugu-10)
            System.out.println(" Email adresini kaydedildi.");
        }else {// arananMetin ile bitmiyorsa
            System.out.println("lütfen yazimi kontrol edin");
        }


    }

}
