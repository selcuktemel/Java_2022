package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=879;
        double sayi2=10;



        double sayi3= sayi1/sayi2;// java geniş olana çevirecek
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2);//87.9
        // deger double , variable int
        // yani variable daha dar dolayısyla java bunu otomatik olarak yapmaz sorumluluğu üstlenmemizi ister
        // sağ tarafa yazdığımız int sorumluluk bende demek.
        // sadece sayi2'i (int)sayi2 yaparak double olan sayi2 yi integer yapabiliriz.
        System.out.println(sayi4);

        int sayi5=140;
        byte sayi6= (byte) sayi5; // sag taraftaki int >sol sağ taraftaki variable byte.
        System.out.println(sayi6);
        sayi5=44;
        sayi6= (byte) sayi5;
        System.out.println(sayi6);







    }
}
