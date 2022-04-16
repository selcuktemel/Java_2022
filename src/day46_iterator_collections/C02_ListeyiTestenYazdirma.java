package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeyiTestenYazdirma {
    public static void main(String[] args) {

        // verilen listedeki her elementi 3 artirin

        List<Integer> liste = new ArrayList<Integer>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
        //[5, 7, 8, 6, 9]
        /*
        listenin tüm elementlerini bize gerimesi icin hasNext ve Next methodlarini kullanacagız

         */

        ListIterator itr=liste.listIterator();
        while(itr.hasNext()){ // yanında element oldugu müddetce calisacak
           // System.out.print(itr.next());//57869
            Object sayi=itr.next();
            itr.set((Integer)sayi+3);
        }

        System.out.println(liste);

    }

}
