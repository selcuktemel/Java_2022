package day11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {
        
        // kullanıcıdan ismini alıp bas harfini ve son harfini büyük harflerle yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim5=scanner.nextLine();

        System.out.println("ilk harf : " + isim5.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim5.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim5.length()-1));
                                                 //türkçe dilinde çevirecek             //ismin uzunluğunu bulup son harfini verecek
        String isim="Ali Can";
        System.out.println("isim.length() = " + isim.length());
        String isim1="";
        System.out.println("isim.length() = " + isim1.length());// hiçlik bile bir seydir bir deger ataması yapılmı ama atanan degerin
        String isim3=null;
        System.out.println(isim3);
        System.out.println("isim.length() = " + isim3.length());// null da hiçlik  demek ama null bir değeri yoktur
        String isim6;
        //System.out.println(isim6); deger atama acısından isim3 ve isim6 arasında bir fark yoktur. ama null da bundan haberimiz oldugunu biliriz.


    }
}
