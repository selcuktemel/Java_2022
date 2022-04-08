package day38_inheritance_overriding;

public class Personel {
    public String statu = "Personel";
    public String haklar = "Tüm personel esit haklara sahiptir.";
    public String izin = "Tüm personel yılda 4 hafta izin kullanabilir";




    public void mesai() {
        System.out.println("Tüm personel 5 gün günde 8 saat calisir");
    }


    public void maas() {
        System.out.println("Tüm personel 30 gün *8 saat*10 euru= " + (30 * 8 * 10) + "Euruo maas");
    }
}
