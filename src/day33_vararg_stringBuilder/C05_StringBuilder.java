package day33_vararg_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Aii Can");

        String str = "Ali Can";
        System.out.println(sb1.compareTo(sb2));
        /*
        compare iki sb'i esit olup olmadıgını ilk harften baslayarak tüm karakterleri karsılastırır.
        ayni olan karakterle icin bir sey yazdirmaz.
        farkli olan iki karakter icin ascii tablosuna kac deger geride veya ileride oldugunu yazdirir.
         */
        // tamamen ayni ise bize 0 döndürür

        /*
        bir sb ile Stringi compare edersek java CTE verir.
         */

        // System.out.println(sb1.compareTo(str));

        /*
         * StringBuilder'da equals methodu String'deki==gibi calisir */
        System.out.println(sb1.equals(sb2));//false
        // burada equals methodu var ama iki obje karslastırmasi yapiliyor.

        System.out.println(sb1.equals(str));//false
        /*obje ve String ifade false */
        sb1.setCharAt(4, 'K');
        System.out.println(sb1);

       // System.out.println(str==sb1); farkli obje türleri oldugu icin Jva KIYAS yapmaz

    }
}
