package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();// objeyi çalıstırdıgımız andaki degeri alıyor. asagıdaki  sout için de aynı degeri verecektir.
        System.out.println(time);//22:09:52.785949600

        // bir islemin ne kadar sürede bittiğini bulmak istersek
        // islemden once ve sonra birer time obje olustururarak
        // iki islem arasındaki farkı bulabiliriz.
        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;

        }
        System.out.println(sayi);
        LocalTime time2 = LocalTime.now();
        System.out.println(time2);
        // karsılatırma yapabilmek icin  almamız laım
        double nano1 = time.getNano();
        double nano2 = time2.getNano();
        System.out.println("islem " + (nano2 - nano1));
        //ileriye veya geriye gidbiliri
        System.out.println(time.plusMinutes(1000));

        // istersek zoneId kullanarak istediğimiz bölgenin saati icin de obje olusturabiliriz.

    }
}
