package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer, String> sinifLİstMap = MapOlustur.myMap();
        System.out.println(sinifLİstMap);

        /*
        MyMap.entrySet(); method'u bize Entry'lerden olusan bir set dondurur.
        Eger bu Entry'leri manipule etmek istiyorsak
        methıdun dondurdugu Set'i yeni bir Set olusturup store etmeliyiz
         */
        System.out.println(sinifLİstMap.entrySet());// sadece parantezler farkli
        Set<Map.Entry<Integer, String>> sinifEntrySeti = sinifLİstMap.entrySet();

        System.out.println("NO     ISIM  SOYISIM    BRANS");

        for (Map.Entry<Integer, String> each : sinifEntrySeti) {
           // System.out.println(each);
            Integer entryKey = each.getKey();
            String valueStr = each.getValue();
            String[] valueArr = valueStr.split(",");
          //  System.out.println(entryKey + " - " +valueArr[0]+" - "+valueArr[1]+" - "+valueArr[2]);
            System.out.println("_____________________________");
            System.out.printf("%-6d %-6s %-9s %-6s\n", entryKey,valueArr[0],valueArr[1],valueArr[2]);
            System.out.println("----------------------------");

        }// her bir key ve value yi ayrı AYRI YAZDIRDIK.


    }
}
