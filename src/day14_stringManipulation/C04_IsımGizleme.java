package day14_stringManipulation;

public class C04_IsımGizleme {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        String yenIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase().replaceAll("\\S","*");

        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase().replaceAll("\\S","*");
        ;
        String yeniKkNo="**** **** **** "+ kKno.substring(12);

        System.out.println("Isim SOYISIM : "+ yenIsim+" "+ yeniSoyisim +
                "\nKredi Kartı No : "+yeniKkNo);

    }
}
