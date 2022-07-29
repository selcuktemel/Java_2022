package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {

    public static void main(String[] args) {
// sınıf listesini duzenli bi sekilde yazdirmak
        Map<Integer, String> sinif=MapOlustur.myMap();
        System.out.println(sinif);

        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.printf("%-9s %-10s %-10s %-10s\n", "Numara", " Isim", " Soyisim", " Brans");
        System.out.println("======================================");
   // map yapısindan yazdırdıgımızda kullanıcılar bir sey anlamaya bilir
   // bunun icin mad'daki datalari,istediğimiz formata sokmamız gerekir
   // 1. adımda key ve value'lari mapdan alip iki farkli collection uyesi atadik
        Set<Integer> keySet          = sinif.keySet();
        Collection<String> valueSet  = sinif.values();
        for (Integer each:keySet) {
            String values = sinif.get(each);
            String[] valuesArray = values.split(",");

            int index = 0;

            while (index < valuesArray.length-1)
                System.out.printf("%-10d %-10s %-10s %-10s\n", each , valuesArray[index], valuesArray[++index], valuesArray[++index]);
              }



    }


}
