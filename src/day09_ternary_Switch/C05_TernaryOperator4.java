package day09_ternary_Switch;

public class C05_TernaryOperator4 {
    public static void main(String[] args) {

        // bazen ternary deki sonucun data türleri farlı olabilir/
        // verilen sayi 100'den büyükse sayi'nın karesi alıp yazdıran
        //100 den küçükse "sayi 100den büyük olmalı yazdıran bir ternorty oluşturalım"

        int sayi=50;
        // ternary bize sonuc getirdiğinde ya sonucu direkt yazdırmalıyız veya bir değiskene atamalıyız
        // egere sonuclar farklı data türlerinde ise arama yapamayacağımız variale'n data türü tek olacagından atama yapamayiz
        // sadece direkt yazdirabiliriz


        System.out.println(sayi>100?" " + sayi*sayi:"sayi 100'den büyük olmalı");
        String sonuc=sayi>100?" " + sayi*sayi:"sayi 100'den büyük olmalı";
        System.out.println(sonuc);
    }
}
