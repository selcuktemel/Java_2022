package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir array de en kücük ve en büyük degerleri yazdirin

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0, -5};

        //sort methodu olmadan yapalım tek dek tüm elementleri almamız gerekir
        // burada atamayı en büyük degere atamalıyız
        int enKucukSayi = Integer.MAX_VALUE;//arr[0];
        int enBuyukSayi = Integer.MIN_VALUE;//arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < enKucukSayi) {
                enKucukSayi = arr[i];
            }
            if (arr[i]>enBuyukSayi) {
                enBuyukSayi = arr[i];
            }
        }
        System.out.println("Arraydeki en kucuk sayi : "+ enKucukSayi);
        System.out.println("Arraydeki en buyu sayi : "+ enBuyukSayi);
//sortla yapmak için
        Arrays.sort(arr);
        System.out.println("Arraydeki en kucuk sayi : "+ arr[0]);
        System.out.println("Arraydeki en buyu sayi : "+ arr[arr.length-1]);
    }
}
