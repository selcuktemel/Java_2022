package day30_passByValue;

public class C05_PassByValue {
    //kalici indirim icin ikinci yöntem

    public static void main(String[] args) {

        double etiketFiyati = 100; // local varible
        double indirimYuzdesi = 10;// local variable
        etiketFiyati = kaliciIndirimYap(etiketFiyati, indirimYuzdesi);
        System.out.println("main method'da indirim sonrasi etiket fiyati : " + etiketFiyati);
    }

    private static double kaliciIndirimYap(double etiketFiyati, double indirimYuzdesi) {

        etiketFiyati = etiketFiyati * (100 - indirimYuzdesi) / 100;
        System.out.println("indirimli fiyat : " + etiketFiyati);
        return etiketFiyati;
    }
}
