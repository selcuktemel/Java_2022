package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr [][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

// ilk inner arrya in tüm elementlarrini yazdırın
        System.out.println(arr[0]);// bize [I@4f3f5b24 referansını verir.
        //arr[0] bir array oldugundan direkt yazdirilamaz
        System.out.println(Arrays.toString(arr[0]));//[3 1 7]
        System.out.println(Arrays.toString(arr));//[[I@4f3f5b24, [I@15aeb7ab] REFERANS DEGERLERİNİ VERİRİ
        // içinde iki adet arryay var
        System.out.println(Arrays.toString(arr[0])+Arrays.toString(arr[1]));//[3, 1, 7][6, 10, 2]

        Arrays.deepToString(arr);
        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]


    }

}
