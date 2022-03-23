package day11_StringManipulation;

import java.util.Locale;

public class C01_toLoweCse_ToUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";
        // Biz string methodlarını arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim


        // str.charAt(5); bölye yazdigimizda sonuc artık Strin değil cahar olacaktır.
        // dolayısiyla String'de istedğimiz tüm değişiklikleri önce yapip sonra charAt(0) methodunu kullanırız

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));


    }
}
