package day36_Inheritance;

public class Memur extends Muhasebe {

    public static void main(String[] args) {
        Memur memur1 = new Memur();// kendi clasımdan bir memur olusturdum bu memura hem Muhasebe hem Personel Claslarından ulasılabiliyor.
        // memur1 objesi Memur class'ının objesi olmasına ragmen inherit ettigi Muhasebe ve onunda parenti olan Personel Classlarındaki tum datalari alabilr.


        //personel classından gelen
        memur1.persNo = 1001;
        memur1.isim = "Ahmet";
        memur1.soyisim = "Tepecik";
        memur1.adres = "Ankara";
        memur1.telefon = "3121234545";

        //Muhasebe classından gelenler
        memur1.saatUcreti = 10;
        memur1.maas = memur1.maasHesala();
        memur1.statu = "Memur";
        System.out.println("memur1 = " + memur1);


        Memur memur2 = new Memur();
        memur2.persNo = 1002;
        memur2.saatUcreti = 10;
        memur2.maas = memur2.maasHesala();
        System.out.println("memur2 = " + memur2);

    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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
