package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        //  arr[3]=8;// dedidgimiede java buna itiraz etmez, run time daa array i olusturur.
        //  verilen index arrayin sınırlarının dısında olur diyecektir.
        // arrayde olmayan bir indexe atama yapamayiz.
        //arr={1,2,3,6} var olan bir arraya aynı boyutta bile olsa direkt yeni degerler iceren bir deger atayamayız

        arr=new int[4];//yeniden bir tanımlama yaptıgımız zaman, eski degeri oldürdük ve yeyi bir deger ataması yaptık.
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[]=new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0,0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;

        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5,0]

        //özet:  bir arraya içinde hazır elementlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir array'İ assing ederek yapabilriiz.

        int arrEnYeni[]={1,2,3,4,5};// önce yeni bir 5  elementli bir array olusturdum sonra olusturdugum yeni arrayi atamak istediğim arraya ataa yaptım

        arr=arrEnYeni; // yeni bir deger ataması yaptık. ama önce istediğimiz uzunlukta bir array olusturduk
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
// var olan array 4 elemenliyse 4 elementlidir ekleme çıkarma yapilamaz.







    }
}
