package day36_Inheritance;

public class Ustabasi extends Isci {
    public static void main(String[] args) {

        Ustabasi ustabasi1 = new Ustabasi();
      ustabasi1.isim = "Murat";
      ustabasi1.soyisim = "Gokcek";
      ustabasi1.statu = "Isci";
      ustabasi1.saatUcreti = 15;
      ustabasi1.maas = ustabasi1.maasHesala();
      ustabasi1.isciStatu="Ustabasi";

        System.out.println("ustabasi1 = " + ustabasi1);
    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
