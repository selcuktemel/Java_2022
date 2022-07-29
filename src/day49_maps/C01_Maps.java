package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {
        //Javada collection uyesi bir yapida dat türü object secilirse, her data turunden deger ekleyebiliriz
        // ancak bu durumda sürekli casting problemleri ile karsılasabilriiz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);
        list.set(1, (Integer) (list.get(1)) + 10);


        Map<Integer, String> sinifListesi = new HashMap<>();
        // bir sınıfta ögrenci no ve isim, soyisim, brans olarak Map olusturmak istiyoruz
        // key tek bir unique degerdir.
        //ama value yani deger birden fazla bilginin birlesiminden olusabilir
        // bu durumda dah sonra istediğimizi bilgilere dogru sekilde ulasabilmek icin
        // tüm elementler icin value ayni bicimde olusturulmalidir.(veri siralamasi ve sekilsel acidan)

        sinifListesi.put(101, "Ali, Can, Dev");
        sinifListesi.put(102, "Veli, Yan, QA");
        sinifListesi.put(103, "Ali, Yan, C#");
        System.out.println(sinifListesi);
        //101 = Ali, Can, Dev, 102 = Veli, Yan, QA, 103 = Ali, Yan, C#}

        System.out.println(sinifListesi.keySet());
//[101, 102, 103]

        System.out.println(sinifListesi.values());

//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
    }
}
