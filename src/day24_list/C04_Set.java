package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin");//Yusuf gitti Seckin geldi bize döndürgüğü giden yani yusuf
        System.out.println(isimler);

        List<String> logListesi = new ArrayList<>();
        logListesi.add(isimler.set(2,"Cosmos"));// isimler listesine gider ikinci indexdeki elemanın yerine Cosmos yazar ve bana oaradan silinen elemanı döndürür
        // yazdirırısak bize oradan ayrılan elemanı yazdırır.

        System.out.println(isimler);// [Aykut, Seckin, Cosmos, Oguzhan]

        System.out.println(logListesi);//[Ilker]






    }
}
