package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        // varilen bir arrayi büyükten kücüge sıralayit yazdiran bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        terstenSiralaYazdir(arr);

        //en büyük sayiyi yazdir.
        System.out.println(arr[0]);
    }

    public static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr);// array i sort ile sıraladık
        int tersArr[]=new int[arr.length];// arr'nin uzunlugu kadar yeni bir array olusturduk.
        System.out.println(Arrays.toString(arr));// sıralanmıs hali [0, 1, 3, 4, 5, 6, 9, 9, 25, 45] burada yer değiştirmek için ayn uzunlukta bir array olusturduk
        System.out.println(Arrays.toString(tersArr));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] burada yer değiştirmek için ayn uzunlukta bir array olusturduk ve

        // bastan alıp sona koyacagız
        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(tersArr));


    }
}
