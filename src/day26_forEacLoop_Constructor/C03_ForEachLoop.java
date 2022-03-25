package day26_forEacLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        //   iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //           Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr1[] = {"Ali", "Ayse", "Can", "Fatma"};
        String arr2[] = {"Can", "Evren", "Emsal", "Fatma","Emre"};
        List<String> ortakeElemanlar = new ArrayList<String>();

        for(String each1 :arr1){
            for (String each2:arr2){
                if(each1.equals(each2)){
                    ortakeElemanlar.add(each1);
                }
            }
        }
        if(ortakeElemanlar.isEmpty()){
            System.out.println("ortak eleman yok");
        }else{
            System.out.println("iki array ortak elemanları : "+ortakeElemanlar);
        }



    }
}
