package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {
int sayi1=8;
int sayi2=4;
        System.out.println(sayi1/sayi2);//2
        sayi2=3;
        System.out.println(sayi1/sayi2);//2.666666==> 2
sayi1=22;
        System.out.println(sayi1/sayi2);//7.333333 ==> 7
// java iki integer sayıyı birbirine bölerse sonucu integer olarak verir
// eger virgülden sonra küsürat varsa siler
sayi1=4786;
sayi2=10;
sayi1=sayi1/sayi2;
        System.out.println(sayi1);//478
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//47
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//4
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//0
        // bu işlemi yaparak sondan başlayıp sayılardan kurtulabiliriz

sayi1=4895;
double sayi3=10;
      //sayi1=sayi1/sayi3;// java iki farklı sayı data türünü isleme koyduğumuzda
        // java kücük olan data türü için auto widening yapar
        // bu islemin düşünürsek sayi1/sayi3==> islemin sonucunu double kabul eder.
        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);




    }
}
