package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

        // verilen iki sayıyı toplayan bir method olusturalım

        int sayi1 = 20;
        int sayi2 = 50;

        toplam(sayi1, sayi2);
        //iki double sayinın toplamını yazdiran bir method olusturalım
        double sayi3 = 22.1;
        double sayi4 = 25.5;
        toplam(sayi3, sayi4);

        //eger variable olusturmdan direkt sayiları yazarak method call yaparsam.
        toplam(12, 23);// int toplam
        toplam(12.3, 16.5);//double toplam

        // bir int ile bir double toplamını yazdiran bir method olusturalım
        int sayi5 = 3;
        double sayi6 = 3.2;
        toplam(sayi5,sayi6);//3+3.2 iki double olarak yapar.
        char sayi7='a';
        char sayi8 =12;
        toplam(sayi7,sayi8);



    }

    private static void toplam(int sayi3, double sayi4) {
        System.out.println("bir int bir double toplamı " + (sayi3 + sayi4));
    }

    private static void toplam(double sayi3, double sayi4) {
        System.out.println("iki double toplamı " + (sayi3 + sayi4));
    }

    private static void toplam(int sayi1, int sayi2) {//  bana birsey döndrümeyeceği için void.
        System.out.println("iki integer toplamı " + (sayi1 + sayi2));

    }
}
