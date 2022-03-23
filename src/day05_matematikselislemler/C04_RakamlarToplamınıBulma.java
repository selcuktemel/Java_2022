package day05_matematikselislemler;

import java.util.Scanner;

public class C04_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız 4 basamaklı bir sayının basamaklardaki rakamların toplamını bulunuz
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen 4 basamklı bir tamsayı giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplamı=0;

// Birinci adım rakam=0 rakamlarToplamı=0 sayi =7532

        rakam=sayi%10;//2
        rakamlarToplamı+=rakam;//2
        sayi/=10;//753

// ikinci asım rakam =2 rakamlarToplamı=2 sayi=753 oldu

        rakam=sayi/10;//3
        rakamlarToplamı+=rakam;//5
        sayi/=10;//75

// Üçüncü adım rakam =3 rakamlarTolamı=5 sayi =75

        rakam=sayi/10;//5
        rakamlarToplamı+=rakam;//10
        sayi/=10;//7

// Dördüncü adım rakam =3 rakamlarTolamı=5 sayi =7

        rakam=sayi/10;//7
        rakamlarToplamı+=rakam;//17
        sayi/=10;//0

        System.out.println("girdiğiniz sayının rakamlar toplamı:  "+ rakamlarToplamı);
    }
}
