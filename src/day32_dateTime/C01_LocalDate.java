package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now();//onjenin olusturuldugu tarihi trh'ye atar assing eder

        LocalDate baskaTrh = LocalDate.of(1987, 2, 17);
        // istediğimiz yil ay ve gün degerlerine göre bize obje olusturur.

        System.out.println(trh);//1987-02-17
        System.out.println(baskaTrh);//2022-03-31
        // ger'li methodlarla tarih ile ilgili detay bilgileri alabiliirz
        System.out.println(trh.getDayOfMonth());//ayin kacıncı günü oldugunu yazdirir  //31 (mart)
        System.out.println(trh.getDayOfWeek());// haftanın hangi günü oldugunu yazdirir // tueshday (persmebe)
        System.out.println(trh.getMonthValue());// kacıncı ay oldugunu yazdirir .//3 (ücüncü ay)
        System.out.println(trh.getYear());//2022

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));// yirmi hafta önce tahih
        System.out.println(trh.minusWeeks(5).minusDays(3));// 5 hafta 3 gün sonra hangi gün

        System.out.println(trh.plusMonths(9).plusDays(10));// 9 ay 10 gün sonra hangi tarih

        // istedigimiz ulkenin o andaki o andaki tarihini elde etmek istersek.
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01

//is ile baslayan methodlar, true false boolean sonuclar dondurur.
        System.out.println(LocalDate.now().isLeapYear());//false subat 28  cekti 2022 de
        // LeapYear artık yıl demek
        System.out.println(trh.isAfter(baskaTrh));//true
        System.out.println(trh.isBefore(baskaTrh));//false

    }
}
