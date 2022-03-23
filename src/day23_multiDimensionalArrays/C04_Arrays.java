package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullanıciya kac elementlik bir array olusturacagini sorun  array i olusturup elementleri kullanıcıdan alıp arraye atayin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elementlik bir array olusturacaksınız?");
        int uzunluk=scanner.nextInt();// kullanıcı 5 yazdiysa

        int arr[]=new int[uzunluk];// [0,0,0,0,0] olan bir arr olusturur.

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin"+(i+1)+". inci elemanı giriniz. ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("olusturulan arr : "+Arrays.toString(arr));

    }
}
