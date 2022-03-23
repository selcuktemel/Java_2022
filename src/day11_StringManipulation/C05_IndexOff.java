package day11_StringManipulation;

import java.util.Scanner;

public class C05_IndexOff {
    public static void main(String[] args) {

        //kullanıcıdan mail adresini isteyin @ işareti içermiyorsa geçersiz yazdirin
        // içeriyorsa mailiniz kabul edildi yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresini giriniz");
        String mail = scanner.next();
        int sonuc=mail.indexOf("@");

        if (sonuc>=0){
       System.out.println("mailiniz kabul edildi");
        }
        else {
            System.out.println("mail geçersiz");
        }
        //özet indexOf methodu içerisine yazilan String veya char IN METİNDE HANGİ indexde oldugunu bize döndürür
        // eger aradıgımız metin veya char yoksa , olmadıgının delili oalrak bize -1 döndürür.
    }
}
