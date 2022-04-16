package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(9);
        System.out.println(list);//[5, 7, 8, 6, 9]

        Iterator itr=list.iterator();// itrator methodunu olusturgumuz liste objesi üzerinden ArrayList calss'indan calistiriyoruz.

        /*iterator nasil çalisir:
        bir iterator objesi olusturmak icin collestion uyesi bir obje kullanmaliyiz
        yani biz nu şterator objesini bizim ornegimizde liste objesi üzerinede calismak icicn
        olusturmus olduk
        Biz ıterator objesini olusturgumuzda ,iterator collection in ilk elemntinin oncesinde gidip bekler
        [(itr)5, 7, 8, 6, 9]
        itr.hasNext()==> true iterator'a yaninda eleman mar mi dieye sorar, true veya false döndürür

        itr.next();==> iterator bir sonraki elementin yanina gecer
                               ve üzerinden gectigi elementi bize dondürür.
              itr.next();
              [(itr)5, 7, 8, 10, 11]  true..
              itr.next();
              [5, (itr) 7, 8, 6, 9] // 5
              itr.next();
              [5, 7,(itr)  8, 6, 9] // 7 7'nin üzerinden geçtiğimiz icin 7'yi dondürdü


        */

        System.out.println(itr.hasNext());//true yanında element var mı diye soruyor hasNext
        System.out.println(itr.next());//5
        System.out.println(itr.next());//7


        itr.remove(); // iteratorün elinde olan elemani sildi tekrar çalıstırılırsa hata verir. cünkü elimizdekini sildik zaten.
        System.out.println(list);//[5, 8, 6, 9] en son 7'yi tutumustuk ve elimizde olanı sildi.



    }
}
