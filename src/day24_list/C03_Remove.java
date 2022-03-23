package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);//[5]
        sayilar.add(3);//[5,3]
        sayilar.add(0, 7);//[7,5,3 ]
        sayilar.add(2, 7);//[7,5,7,3]

        sayilar.remove(3);// sayi yazdigimiz anda index olarak 3 üncü indexdeki elementi siler
        //   sayilar.remove(5);// 5 inci index olmadgı için hata verecektir.(.IndexOutOfBoundsException: Index 5 out of bounds for length 3
        // sayilardan olusan bir lİst'te objeyi vererek element silme methodu çalismaz
        //sayi degeri girdigimizde java otamatik olarak sayiyi index kabul eder.

        /*int sayi=5;//  bu bir primitive oldgu için kaldıramazyız
         sayilar.remove(sayi);// IndexOutOfBoundsException: */

        Integer sayi=5;//  bu bir obje oldugu için bunu remove(sayi) olarak kaldirabiliriz.Wrapper Class kullanınca sayi obje oldugundan bu method çalıır.
        sayilar.remove(sayi);// sayilar listindeki 5 i kaldırdık.
        System.out.println(sayilar);//[7, 7]


    }
}
