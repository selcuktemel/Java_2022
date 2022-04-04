package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1987,2,17);
        System.out.println(Period.between(dogumGunu, bugun)); //P35Y1M14D

        System.out.println(Period.between(dogumGunu,bugun).getYears());//35
// FIXME: 31.03.2022


    }
}
