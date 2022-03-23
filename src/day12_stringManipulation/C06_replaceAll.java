package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanıcıdan isim soy isim bilgisini alıp bütün  harfleri * yapalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("isim ve soy isiminizi giriniz");
        String isimSoyisim = scanner.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S ","*"));
    }
}
