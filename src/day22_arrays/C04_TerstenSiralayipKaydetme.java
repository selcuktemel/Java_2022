package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        // varilen bir arrayi büyükten kücüge sıralayit döndüren bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        arr=terteSirala(arr);// böyle bir atama yaptıgım zaman olusturulan methoda return type int[] olarak geldi
        System.out.println("arr in son hali : " +Arrays.toString(arr));//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
        System.out.println("en buyuk element : " +arr[0]);

        //int arr2[]=new int[arr.length];
        //arr2=arr;// arr arr2 ye atama yapildi.
        //System.out.println(Arrays.toString(arr2));
    }


    public static int[] terteSirala(int[] arr) {
        Arrays.sort(arr);// array i sort ile sıraladık
        int tersArr[]=new int[arr.length];
        System.out.println(Arrays.toString(arr));// sıralanmıs hali [0, 1, 3, 4, 5, 6, 9, 9, 25, 45] burada yer değiştirmek için ayn uzunlukta bir array olusturduk
        System.out.println(Arrays.toString(tersArr));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] burada yer değiştirmek için ayn uzunlukta bir array olusturduk ve

        // bastan alıp sona koyacagız
        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];
        }

        return tersArr;


    }
}
