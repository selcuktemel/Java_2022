package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("D");//[D]
        harfler.add("M");//[D,M] eger ozel bir sey söylemediysek sonuna ekler
        harfler.add(1,"T");//[D, T, M]
        harfler.add(0,"T");//[T, D, T, M] // java arrayde virgülden sonra bir bosluk bırakır
        System.out.println(harfler);
        harfler.contains("T");//true
        System.out.println(harfler.contains("T"));//TRUE
        System.out.println(  harfler.contains("F"));//FALSE

        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        harfler.containsAll(karakterler);// harfler listesi karakterler listesini içeriyor mu? sırası önemli değil
        // true karakterle listesinde bulunan tüm karakterler harfler listinde var mı?
        System.out.println( harfler.containsAll(karakterler));// true
        karakterler.add("F");
        System.out.println( harfler.containsAll(karakterler));//false






    }
}
