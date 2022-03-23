package day21_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        // data türü array'in ismi ve köseli parantez yazarak array deklare edilir.

        int arr1[]={1,3,5};// köşeli parantezle olur
        int[] arr2={1,3,5};// közeli parantez intden sonra
        int [] arr3={1,26,48,8};// intden sonra bir bosluk köseli parantez
        double arr4[]={1.0,26.5,48.56,8.55};// yazdıgımız data türü neyse array in içindeki de o olmalı

        String arr[]={"ali", "veli","ayse","Mustafa"};

                //assing mecburi mi
        int sayi;

        int arr6[];// kullanmadan önce mutlaka deger ataması yapmamız gerekir.

        //hem declare edip hem de atama yapacaksam nasil yapabilirim.
        // 1 - declare edip esitliğin satırda suslü parantez içerisinde degerleri yazabilirim
        String arr7[]={"ali", "veli","ayse","Mustafa"};
        // 2- içine deger atamadan olusturmak isterseniz, boyutunu belirlemek gerekir.

        int arr8[]=new int[5];// tepsi kaç bardak alacak yani boyutunu söylememiz gerekir.
                             // tek tek eleman sayisini belirtmezsek bizden kaç eleman olusturmamız gerektiğini yazmamızı ister
                             // java içinde  5 yazarsam 5 adet default deger olan bir array olusturur.
        // yukarıdakini yaptıgımız zaman [0,0,0,0,0]







    }
}
