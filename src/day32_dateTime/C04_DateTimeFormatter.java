package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println(dateTime);//2022-03-31T22:39:31.117718

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY/");// Yukaridakini ve bunu birlestimemiz lazım

        System.out.println(formatter.format(dateTime));// dateTime ı formatlayrak istediğimiz sekle soktuk.

        DateTimeFormatter formatersaat = DateTimeFormatter.ofPattern("H:mm:ss");
        System.out.println(formatersaat.format(dateTime));


        /*
         format olustururken
         GUN
         d    : basta 0 varsa onu yazmadan gun numarasi
         dd   : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD  : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE       : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M   : basta 0 varsa onu yazmadan ay numarasi
         MM  : tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         hh  : 12 saat üzerinde 2 rakam olarak yazdirir.

         h  :

         a yazarsak AM veya PM degerini yazar

         m : minute
         mm : 01 ,02  seklinde yazdirir.


         */


    }
}
