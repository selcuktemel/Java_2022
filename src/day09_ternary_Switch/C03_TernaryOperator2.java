package day09_ternary_Switch;

public class C03_TernaryOperator2 {
    public static void main(String[] args) {
        int sayi=-10;
        //verilen sayının 3 veya daha çok basamkalı olup olmadığını kontrol eden ve sonucu yazdıran bir ternary olusturun

        String sonuc;
        sonuc=sayi >=100?"sayi  3 basamaklı veya daha büyük":"sayi negatif veya 3 basamaktan kücük";
        System.out.println("girdigini sayi analizi : " + sonuc);



//Ternary bize sonuc döndürügü iiçin ya bu sonucu direkt yazdırmalıyız ya da sonucun data tipine uygun bir variable atama yapabilriz.





    }
}
