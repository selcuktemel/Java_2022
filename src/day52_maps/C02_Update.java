package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
        /*
        verilen mapdeki tüm bransları Java yapalım
         */

        Map<Integer, String> sinifLİstMap = MapOlustur.myMap();

        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifLİstMap.entrySet();


        for (Map.Entry<Integer, String> entry : sinifEntrySet) {
            Integer keyEntry = entry.getKey();
            String valueEntry = entry.getValue();
            String[] valueArr = valueEntry.split(", ");
            valueArr[2] = "Java";
            String yeniValue = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2];

            sinifLİstMap.put(keyEntry,yeniValue);
            System.out.println(sinifLİstMap);
        }
/* verilen mapdeki numarası 102 olan kaysın bransını Phyton yapalım  */
        for (Map.Entry<Integer, String> entry : sinifEntrySet) {
            Integer keyEntry = entry.getKey();
            if (keyEntry ==102) {
                String valueEntry = entry.getValue();
                String[] valueArr = valueEntry.split(", ");
                valueArr[2] = "Phyton";
                String yeniValue = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2];

                sinifLİstMap.put(keyEntry,yeniValue);
                System.out.println(sinifLİstMap);

            }

        }
    }
}
