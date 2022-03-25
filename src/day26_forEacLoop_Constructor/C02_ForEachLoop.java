package day26_forEacLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        //10 elementli bir list olusturalim.

        int arr[] = {1, 2, 3, 5, 6, 5, 6, 45, 56, 55};
        List<Integer> sayilar = new ArrayList<Integer>();
        for (int each : arr
        ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);
        // sayılar listesinde 3'e bölünemeyen sayilari for-each loop ile yazdiralim
        for (int each :sayilar
        ) {
           if(each%3==0){
               System.out.print(each+" ");
           }
        }


    }
}
