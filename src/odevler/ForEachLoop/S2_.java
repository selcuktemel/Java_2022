package odevler.ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class S2_ {
    public static void main(String[] args) {
      /*  Soru 2: Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
        loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
            */

    List<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(5);
    list.add(5);
    int kareleriToplami=0;
    for (Integer each1 : list){
        kareleriToplami+=each1*each1;

    }
        System.out.println(kareleriToplami);

    }
}
