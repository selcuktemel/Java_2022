package day45_interface_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        /*
        List<Integer> sayilar = new List<>();
        public interface List<E> extends Collection<E> list interface oldugu icin şimdiye kadar ArrayList(); constructorunu kullandık.

        */

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);//[5, 8, 9, 10, 11]

        // for each kullanarak her elementi 2 artıralim

        for (Integer each : list) {
            each = each + 2;
        }
        System.out.println(list);//[5, 8, 9, 10, 11]
        // neden artırmadı cunkü each dediğimiz variable loop un icinde olusturuldu.
        // each loopun icinde oldugu için orada yapılan degisiklikler orada kalacaktır.
        // bunun yerine iterater class olusturulmustur.
 /*public interface Iterator<E>  INTERFACE OLDUGU İCİN NEW Iterator diyemeyiz*/

        Iterator itr=list.iterator();
        // list objesi uzerinde baglı oldugu clasdaki iterator() methodunu cagırdık.
        // iterator() methoduna yaklasıp üzerine tıkladıgımızda bizi list interface'ine götürecek
        // public interface List<E> extends Collection<E>'a geldik bunun altında bulunan method Iterator<E> iterator();
        // List inerface oldugu icin buradaki Iterator<E> iterator(); abstractır.method body yok.
        // method interface olunca mutlaka ovverride edilmesi gerekir. onun icin ArrayList tarafında  Iterator<E> iterator(); METHODU OVVERRİDE EDİLMELİDİR.


    }

}
