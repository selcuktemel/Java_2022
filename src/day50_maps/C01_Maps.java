package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
//siniftadik ogrenci listesini düzenli olarak yazdiralim
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);// map'de index yapisi yok. mapin icinden birinci key getir ikinci key getir diyemiyoruz.
        // mapden 101'e ulasma imkanim yok. onun icin benim 101 102 ve 103Eindexle ulasabileceğim bir yapiya ulaşmam lazım

        Set<Integer> sinifKeySet = sinifListMap.keySet();//keyleri alip bir sete atadım. ama sette index yapisi yok seddeki seyleri indexli bi yapiya atmma lazım
        // array veya liste atmaliyiz
        List<Integer> keyList = new ArrayList<>();
        // for (Integer eac : sinifKeySet) {
        //     keyList.add(eac);
        // }

        /* eger key'lere tek tek ulasmak istersek index yapisina ihtiyacimiz var
         * ancak map index yapisini desteklemezz bunun icin keyleri once bir sete
         * sonra da set'in tum elemenerini bir liste ekledik */
        keyList.addAll(sinifKeySet);// yukaridaki foreach ile ayni
        System.out.println(keyList);//[101, 102, 103] index yapinisi deztekliyor
        System.out.println(keyList.get(2));// ikinci indexdeki degeri verir.
        /* simdi de value'leri index ile ulasabileceğimiz bir sekle sokalim.*/
        Collection<String> sinifVauleColl = sinifListMap.values();
        System.out.println(sinifVauleColl);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        // tek tek ulasabilecegimiz bir seyin icine koymamız lazım.
        System.out.println(sinifVauleColl.size());// 3
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifVauleColl);
        System.out.println(sinifValueList);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        // multidaimational array'e ihtiyacım var
        // her bir  value birden fazla bilgiyi iceriyor
        // onun icin valueleri multisimensional bir array'e atmak mantıklı duruyor
        // ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var.

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut);//3
        /*
        inner arraylerin boyutunu bulmak bizim icin vira daha komples olacak
         */
        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);//Ali, Can, Dev
        /*
        kaç elementten olustugunu bulmak icin split kullanırız
         */
        String[] ilkValueArray = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;
        System.out.println(innerArrayBoyut); //3


        String[][] valueMDArr = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {// bu bana tek tek listin icindeki Ali Can Dev getirecek
            String temp[] = sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }

        System.out.println(Arrays.deepToString(valueMDArr));// içiçe arr olusturudk
        /*
        ozet: bu satıra kadar; keyleri index ile ulastigim keyList'e atadim,
        value'leri valueMDArr'e atadim.
         */
        // şimdi bu key ve valueleri istediğim gibi manupule edebilirim.

        System.out.println("Numara    Isim   Soyisim    Brans");
        System.out.println("==================================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "     ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "     ");
            }
            System.out.println("");
        }

    }
}
