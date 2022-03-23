package day03_scanner;


import java.util.Scanner;

public class C04_Scanner1 {
    public static void main(String[] args) {

        // Scanner kullanmak için 3 adim takip ediyoruz
        // 1'inci kendimize bir scanner oluştumak
       // eşitliğin saüında yeni bir scanner oluşturulur
        // ve oluşturulan bu scanner scan variable'na assing edilir
        // scan variablenin ismidir istediğimiz ismi de verebiliriz.
        Scanner scan =new Scanner(System.in);
        // 2 kullanicidan istediğimiz değeri girmesi için açıklayıcı bir bilgi yazdirilir
        System.out.println("Lütfen isminizi giriniz");
        // 3 adım kullanıcının girdiği değeri uygun bir variable oluşturup kaydedin
       // String kullaniciIsmi=scan.next();// (NEXT ();)SADECE İLK KELİMEYİ ALIR (İLK BOŞLUĞA SPACE KADAR ALIR)
        String kullaniciIsmi=scan.nextLine();//  SATIR SONUNA KADAR GİRLİNE BÜTÜN DEĞERLERİ ALIR
        System.out.println("kullanıcın girdiği isim: " + kullaniciIsmi);

    }
}
