package day25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin
        // primitive
        String arr[] = {"A", "B", "C"};//
        Arrays.asList(arr);//burasi arr yi listeye çevir ama atama yapmazsak havada kalır
        List<String> arraydenList = Arrays.asList(arr);


        // arrayden liste çevirdiğimiz zaman yini listin uzunlugunu degistiremeyiz,
        // yeni list ile add remove clear gibi methodlar çalıştırmak istedğimizde exception olusur.
        //arraydenList.add("J");//UnsupportedOperationException
        System.out.println("19'uncu satırda list  : " + arraydenList);

        arr[1] = "F";

        System.out.println("23'üncü satırda Array : " + Arrays.toString(arr));
        System.out.println("24'üncü satırda list  : " + arraydenList);// listle ilgili herhangi bir işlem yapmamamıza ragmen arrayList degişti.

        arraydenList.set(0, "Y");

        System.out.println("28'üncü satırda Array : " + Arrays.toString(arr)); //arrde herhangi bir işlem yapmamamıza ragmen arr degişti.
        System.out.println("229'üncü satırda list : " + arraydenList);//
        // hangisini degistirirsen o degiştiriliyor.
    }
}
