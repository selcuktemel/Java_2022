package day23_multiDimensionalArrays;

public class C03_MultiDimensionalArrays {
    public static void main(String[] args) {

        // boyutlari belirli bir array i eleementleri girmeden olusturalim
        //bir okulda içinde 24 ögrenci olan 8 sinif vardir.


        int arr[][]=new int[8][24];

        // bir ilcede her birinde 24 ögrencilik 8 sınıf bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kişilik 2 tane de 22 kisilik sınıf vardir.bunu yapamayız
        // cünkü arraylerde toklama cıkarma yoktur bunu olusturmak için iki farklı array olusturmak gerek
        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];
        // olustururken elementleri atam yaparsak farklı boyutta farklı uzunlukta inner arrayler tanımlayabiliriz.

        int arr1 [][] = {{3, 1, 7,5}, {6, 10}};// buna itiraz etmez.
    }
}
