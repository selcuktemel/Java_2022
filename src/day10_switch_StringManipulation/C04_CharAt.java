package day10_switch_StringManipulation;

public class C04_CharAt {

    public static void main(String[] args) {

    //String de herhangi bir karakteri almak istediğimizde o harfin index ini kullanarak str.charAt(istenen index yaazabiliriz)

        String str = "Java Cok Guzel";

        //J ,i yazdiralim
        System.out.println(str.charAt(0));
        // G yi yazdiralim
        System.out.println(str.charAt(9));
        //va yazdiralim
        System.out.println("" +str.charAt(2)+str.charAt(3));// charları matemkatiksel işleme sokrasak ascii degerlerileri işleme girer.
        //cOK yazdiralim
        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));
        //son karakteri yaz ileriki derslerde kaç karakter olduğunu bize söyleyecek saymamıza gerek  kalmayacak
        //String'de 14 harf var, dson harfin index'i 14-1
        System.out.println(str.charAt(14-1));
        // eger uzunluğu index olarak girersek
        System.out.println(str.charAt(14));


    }
}
