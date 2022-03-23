package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
// verline Array de istenen bir elementin var olup omadigini true false yazdirarak /
// gösteren bir method olusurun
        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi = 14;


        istenenElemanVarMi(arr, istenenSayi);
        // eger javadan  binarySearch ile yapmak isteseniz
        //önce sort methodunu kullanıp, sonra birnarySearch yapmaliyiz



    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc = false; // burada false
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenenSayi) {
                sonuc = true;// sart gerçeklesirse true olacak
                break;//sarttan bir tanesini bulursa biter.
            }


        }
        System.out.println(sonuc);
    }
}
