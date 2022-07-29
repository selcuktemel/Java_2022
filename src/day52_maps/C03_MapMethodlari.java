package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H",5);
        myMap.putIfAbsent("K",5);
        /*BİR EKLEME YAPMAK İSTEDİĞİMİZDE KEY DAHA ONCE EKLENMİSSE MAP'E EKLESİN
        DAHA ONCEDEN EKLEMİSSE ESKİYİ SİLMEMEK İCİN BİZİ UYARSIN
         */

        System.out.println(  myMap.putIfAbsent("A",5));
        if (  myMap.putIfAbsent("K",5) != null) {
            System.out.println("gidiginiz key Mapta zaten var");
        }

        System.out.println(  myMap);// 5
        myMap.put("A",10);
        myMap.computeIfAbsent("A",v->20);
        System.out.println(  myMap);
        myMap.compute("A",(key,val) ->20);// lambda expresition
        System.out.println(  myMap);
        /*"H" valueleri 2 katının 5 fazlası yapalım*/

        myMap.compute("H",(key,val) ->(2*val+5));
        System.out.println(myMap);







    }


}
