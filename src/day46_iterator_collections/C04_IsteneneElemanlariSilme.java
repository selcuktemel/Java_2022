package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IsteneneElemanlariSilme {
    public static void main(String[] args) {
     /*
     bir listedeki istenen sayi araliginda olmayan elemnetleri silen bir program yaziniz
     orn: [2,13,56,23,45,14,40] istenen aralik 20-40 arasi (sinirlar dahi) output[23,40]
     (2. bir list olusturmadan gecerli bir liste uzerinde islem yapiniz
      */

        List<Integer> liste = new ArrayList<Integer>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);
        ListIterator itr=liste.listIterator();
        while(itr.hasNext()){
            Object sayi=itr.next();
            if ((Integer)sayi<20||(Integer)sayi>40) {
                itr.remove();
            }

        }
        System.out.println(liste);
    }
}
