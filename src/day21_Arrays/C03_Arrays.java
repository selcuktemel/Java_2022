package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[];// deger ataması yapmadık ama java kabul etti ancak kullanmamıza izin vermez.


       // arr = {1, 3, 5}; böyle bi yazımı kabul etmez
        arr=new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);//6
        // Srtrig deki length() methodunda ()parantez var bunda yok length

        //arraydeki her bir elemani index degeri kadar artıralım

        for (int i=0; i<arr.length; i++){
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

//son indexdeki elementi yazdiralim
        System.out.println(arr[arr.length-1]);

    }
}
