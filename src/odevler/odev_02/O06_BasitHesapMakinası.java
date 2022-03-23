package odevler.odev_02;

import java.util.Scanner;

public class O06_BasitHesapMakinası {
    public static void main(String[] args) {
        /*Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor.
        Program aşağıdaki özellikleri sağlamalıdır.
          1.Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
          2.Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb…
          3.Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
          4.Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
           */

        // 1.konsoldan giriş yapabilememiz için scanner oluşturuyoruz
         Scanner scan =new Scanner(System.in);
       // 2 sitemnde bizden istediği işlemleri ekranda yazdırıyoruz bunu yapmasak da olur
        System.out.println("***********");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çapma");
        System.out.println("4-Bölme");
        System.out.println("5-Bölümden Kalan");
        System.out.println("***********");
        //3 sistemden girilecek sayı değerlerini ve sayı değerleri sonrası seçilecek islemi isteyelim
        int sayi1,sayi2,işlemler;

        System.out.println("Birinci sayiyi giriniz");
        sayi1=scan.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        sayi2=scan.nextInt();
        System.out.println("Yapılacak işlem türünü seçiciz");
        işlemler=scan.nextInt();
        switch (işlemler){
            case 1 :
                System.out.println("Toplama : " +(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma : "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme : "+ (sayi1/sayi2));
                break;
            case 5:
                System.out.println("Bölümden Kalan : "+(sayi1%sayi2) );
                break;
            default:
                System.out.println("lütfen geçerli bir değer giriniz");
        }





    }
}
