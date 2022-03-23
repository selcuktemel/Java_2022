package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {

        String str="bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a",5));// data türleri farklı "a"
        System.out.println(str.indexOf('a',5));// data türleri farklı 'a'

// bir class'da ayni isimde birden fazla method olmasına overloading denilir.
        //ya parametre sayısı farklı olmalı
        // veya parametre sayısı aynı ise argumentlerin data türleri farklı olmalı

    }
}
