package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi silip kalanları
        // yeni bir array olarak yazdiran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenemeyenEleman = 3;

        istenemeyenElementiSilYazdir(arr, istenemeyenEleman);
//1 istenmeyen say
//2 yeni array olustur.
//3 eski arrayden uygun elementleri yeniye tasi
// 4 bunu yazdir.
    }
    public static void istenemeyenElementiSilYazdir(int[] arr, int istenemeyenEleman) {
        // istenmeyen element sayisini bulallım
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenemeyenEleman) {
                sayac++;
            }
        }

//2 yeni elemeneti olusturalim
        int yeniArr[] = new int[arr.length - sayac];
//3 eskii arrayden uygun elementleri yeniye taşı
        int index=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]!=istenemeyenEleman){
                yeniArr[index]=arr[i];
                index++;
            }
        }
        // 4 listeyi yazdirmak.
        System.out.println(Arrays.toString(yeniArr));

    }
}
