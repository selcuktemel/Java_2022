package odevler.StringManipulation;

import java.util.Scanner;

public class O01_contains {
    public static void main(String[] args) {
        //Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresini kaydedildi “
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresinizi giriniz");
        String mail = scanner.next();

        String arananMetin = "@gmail.com";


        System.out.println("son kullanıldığı index : " + mail.lastIndexOf(arananMetin));
        System.out.println(("@gmail.com uzunluğu : " + (mail.length() - 10)));

        if (!mail.contains(arananMetin)) {// aranan metni içermiyorsa
            System.out.println("lütfen mail adresinizi giriniz");
        }

        //aranan metin ile bitiyorsa @gmail.com'un uznluğu sabit (@ g m a i l . c o m)
        //                                                        1 2 3 4 5 6 7 8 9 10
        else if ((mail.lastIndexOf(arananMetin)) == // mail adresinin içinde aranan metin yani @gmail.com sondan başlatılrak aranmıştır.)

                (mail.length() - 10)) {// daha sonra mail uzunluğunda @gmail.com un uzunluğu sabit oldugundan çıkarılmış
                                      // ve bu iki eşitse mailin @gmail.com bittiği anlaşılmıştır.
                                      // bunu yukarıdaki if ile içerip içermediğini kontorl ettik içermiyorsa diğer sart cümlesine zaten geçmeyecek.
            System.out.println("Email adresini kaydedildi");
        }
        else {
            System.out.println("lütfen yazimi kontrol ediniz");
        }


    }
}
