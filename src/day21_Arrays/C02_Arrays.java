package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[] = {"Ali", "Veli", "Ayse"};// bu variableler nasıl bulunacak
        // array içindeki eşementlere ulasabilmek için index kullanırız

        System.out.println(arr1[0]);// arr1 array ine gidecek ve 0 indexindeki Ali yi yazdıracak
        arr1[1] = "Esila";// 1 inci indexde bulunan Velinn yerine yeni değer Esila yaptık
        System.out.println(arr1[1]);
// Arrayin içindeki indexi kullanarak elenmelere ulasabilir ve update edebiliriz.

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);//ArrayIndexOutOfBoundsException
// Arrayin tamamini yazdırmak istersek
        System.out.println(arr2);// burada referansı yazdırır.[I@4f3f5b24
        // yazdırmak istediğimi data türü primitive oldugu için ve Arrayler non primitive olduklarından
        //  direk yazdırmak istersek java referans bilgisini yazdırır

        for (int i = 0; i <4 ; i++) {
            System.out.print(arr2[i]+" ");
        }// her seferinde yazdirmak için forla yazdırmak zahmetli iş
        //onun için array yazdırmak için javadaki Arrays Class'inden toString() methodunu kullanırız.

        System.out.println("");

        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0]
        arr2[1]=11;// 1inci indexe 11 atadık
        arr2[3]=22;// 3 üncü indexe 22 atadık diger indexlere atama yapmadıgımız için defayult degerlerini korur
        System.out.println(Arrays.toString(arr2));//[0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1));//[Ali, Esila, Ayse]







    }
}
