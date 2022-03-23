package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 3;
        //eger javadan hazir BinarySearch ile yapmak isterseniz
        // once sort methosunu kullanıp, sonra binarySearch yapmaliyiz
        // binarSearch(), bize istenen sayinin oldugu indexi verir.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        System.out.println(Arrays.binarySearch(arr, istenenSayi));// index verir, istenenSayi 3 ise arr içindeki 3 ün  indexini verir
         // eger olmayan bir elementi aratirsak
         // Java bulamadıgini göstermek için - işareti koyar sonra da o sayi olsaydi siralamsı ne olcak ise bize o sirayi verir.


    }
}
