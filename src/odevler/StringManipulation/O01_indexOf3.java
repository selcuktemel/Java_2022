package odevler.StringManipulation;

import java.util.Scanner;

public class O01_indexOf3 {
    public static void main(String[] args) {
        // kullanicidan bir cumle isteyin
        // case sensitive olmadan Java kelimesi icerip icermedigini yazdirin


        //kullanıcıdan bir cümle girmesini istedik.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine().toLowerCase();

        //girinlen cümle string oldugu için ve indexOf methodu da bize sonucları int olarak verdiği için
        // kullanıcıdan aldığımız String ifadeyi sayısal ifadeye çevirdik.
        // eger "bugun javayı ogrenmek icin çok çabaladım" gibi bir ifae yazdırıp (int sonuc = cümle.indexOf("java"); yazıp
        // ve System.out.println(sonuc); yazdırırsak bize "java" yazısının kacıncı indekxden itibaren basladığını int olarak verir.
        // sonuc int oldugu için karşılastırma operatörlerini daha kolay kullanabilirim
        // sonuc olarak girilen cümlenin "java" kelimesini içerip içermediğini bulabilmem için int tipinde bir variable oluşturup
        // String olarak kullanıcıdan istediğim variable int olarak olusturduğum variableye indexOf metodu ile atama yapıyorum.
        int sonuc = cümle.indexOf("java");
        System.out.println(sonuc);

        System.out.println("ternary  ile sonuc : " + (sonuc == -1 ? "java icermiyor" : "java içeriyor"));

        if (sonuc >= 0) {
            System.out.println("if ile sonuc : java içeriyor");
        } else {
            System.out.println("if ile sonuc : java icermiyor");
        }
    }
}
