package odevler.StringManipulation;

public class O08_indexOf {
    public static void main(String[] args) {

        String merhaba = "java ogrenmek cok eglenceli";
        System.out.println("cumleUznlugu : " + merhaba.length());
        System.out.println("karakter sayisi : "+ (merhaba.length() - 1));

        char deger1 = 'a';
        char deger2 = 111;// ASCİİ tablosundaki degerini verir.
        String deger3 = "en";
        int deger4 = 103;// 103 ASCİİ tablosunda g ye eşittir. int olarak girilen bir degere atama yaptığımız zaman o bize ASCİİ tablosundaki degerini verir.

        System.out.println("deger1 : " + merhaba.indexOf(deger1));// 'a' indexde 1'inci sırada olamamasına ragmen 1 yazdırdı cünkü index 0 dan abaslayarak sayar

        System.out.println("deger2 : " + merhaba.indexOf(deger2));// 111  ASCİİ tablosunda 'o' ya karsılık gelen degerdir char olarak ASCİİ degerini de yazaniliyorun
        // bu da ilk 'o' olan 5 inci indexdekine dekn geliyor

        System.out.println("deger3 : " + merhaba.indexOf(deger3));// 8 inci index "en" ile baslıyor
        System.out.println("deger4 : " + merhaba.indexOf(deger4));


    }
}
