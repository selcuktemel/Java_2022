package odevler.odev_02;

import java.util.Scanner;

public class O05_Password {
    public static void main(String[] args) {
        /*String tipinde sabit bir şifre değişkeni oluşturun.
        Örneğin: String password = “12345”; gibi. Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
        Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. Eğer, iki değer birbirine eşitse ekrana
        “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.*/

        String password ="1234567";
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz");
        String sifre =scan.next();

        System.out.println(password.equals(sifre)? " giriş başarli":"giris basarisiz lütfen tekrar deneyiz");



    }
}
