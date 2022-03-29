package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indrimli fiyatimiz : "+ etiketFiyati);
    }
}
