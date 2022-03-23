package odevler.StringManipulation;

import java.util.Scanner;

public class O01_indexOf6 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();
        System.out.println("lütfen bir harf giriniz");
        String kelime = scanner.nextLine();
        //kelimeyi bastan ve sondan aratıyoruz.
        int girilenKelime=cumle.indexOf(kelime);// girilen kelime cümle basından itibaren sayılacak ve indexi kaç ise int e döndürülecek,
        int girilenKelime2=cumle.lastIndexOf(kelime);//// girilen kelime cümle sonundan itibaren sayılacak ve indexi kaç ise int e döndürülecek,

        if (girilenKelime == -1) {// girilenkelime cümelde yoksa -1 olarak gösterileceği için girilenkelime==1 ise kellime cümlede yoktur
            System.out.println("girilen kelime cümlede kullanılmamıştır.");

        }else if (girilenKelime==girilenKelime2){// girilen kelime bastan ve sonrdan aratıldığında ikisi de birbirinin aynısı demektir. yani bir defa kullanılmıtır.
            System.out.println("girilen kelime cümlede bir kere kullanılmıştır");
        }
        else {// iki secenek de gerçekleşmediyse üçücü secenek devreye girer.
            System.out.println("girilen kelime cümlede birden fazla kullanılmıstır");
        }


    }
}
