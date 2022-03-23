package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, Ilker, Oguzhan]


        //remove (istenenObject )methodu istenen elementi lkaldırıp true veya false döner
        // eger remove isleminin yapilip yapilmadiğini kontorl etmek istiyorsaniz
        // methodu boolean bir variable atayabilriisiz
        boolean sonuc = isimler.remove("Oguzhan");//true (object o) boolean deger verir


        // sonucu kullanıcıya yazdırmak isterseniz if else ile istedimiz degerlendirmeyi yapabilrisin
        if (sonuc == true) {
            System.out.println("istediğiniz isim silindi");
        } else {
            System.out.println("istedigniz isim listede oladıgından silinemedi");
        }
        System.out.println(isimler);//[Aykut, Yusuf, Ilker]

      sonuc=  isimler.remove("Berk");
        if (sonuc == true) {
            System.out.println("istediğiniz isim silindi");
        } else {
            System.out.println("istedigniz isim listede oladıgından silinemedi");
        }
         // remove(index) yazdigimizda sildim silmedim ihtimali kalmaz,
        // bize remove edilen elementi döner.

        System.out.println(isimler.remove(1));//Yusuf yusufu siler ve sildigi indexdeki elementi bize döndürür.

        // yazdirsak da yazdirmasak da liste degisti ve 1 inci indedeki elenemt silindi

        System.out.println(isimler);//[Aykut, Ilker]

    }
}
