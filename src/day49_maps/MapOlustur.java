package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap() {
        Map<Integer, String> sinifListesi = new HashMap<>();
        sinifListesi.put(101, "Ali, Can, Dev");
        sinifListesi.put(102, "Veli, Yan, QA");
        sinifListesi.put(103, "Ali, Yan, C#");
        return sinifListesi;
    }
}
