package day38_inheritance_overriding;

public class Isci extends Personel {
    public String statu = "Isci";
    public String haklar = "Isciler Kıdem tazminati alırlar.";
    public String ikramiye = "Isciler yilda bir ikramiye alır";




    public void mesai() {
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }



    public void maas() {
        System.out.println("Isciler  30 gün *8 saat*11 euru= " + (30 * 8 * 11) + "Euruo maas");
    }

}
