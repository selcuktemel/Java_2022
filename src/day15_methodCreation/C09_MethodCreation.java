package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim = "oguzhan";
        String soyisim = "BALKAYA";
        String kKno = "1234567890123456";
        // eger bir methot'dan bir islem yapmasıni ve yaptıgı islemi bize gerimesini isterseniz
        // return type vod değil, bize getireceği sonucun data türününde olmalıdır.
        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim, soyisim);
        //bana isim ve soy isim gizlemiş halini getirmesini sitiyorum
        //beklediğim donus String olur
        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKrediKartiNo = krediKartiGizle(kKno);
        System.out.println(gizlenmisKrediKartiNo);

        //temel amacımız yapılan degişiklikleri o haliyle kaydedebilmektir.
        //gizlediğim her seyi o haliyle hep kullanabileyim
        // fatura yollmaya göndeririz bize majbuz getirebilir. bazende 100 lira veriiriz cocuğa git bununşa 4 ekmek al gel deriz
        // verdiğimiz işle onun getirdiği işin aynı olması gerekir bize fiş getirmesinin bi anlamı yoktur.
        // ben artık gizlemiş bilgileri getirmesini istiyorum.
        // bu duruda isin rengi değisiyor.yazdırıyorsak method void olabilir void bana bi şey getirme demek.
        // ben artık bir iş yapmasını ve o işi bana getirmesini istiyorum.
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yenIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase().replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase().replaceAll("\\S", "*");
        // method olusturmada 3 üncü adım
        // method ocalısınca sadece bir sey mi yazdiracak
        //yoksa bize bir data mi dondurecek buna karar verecek
        // bu soruda gizlenmi isim soyisim dondurmesi istendiğinden
        //return Type'i void degil String sectik
        // ve methodun sonuna return edilecek datayi yazdik
        return yenIsim + " " + yeniSoyisim;
    }

    public static String krediKartiGizle(String kKno) {
        String yeniKkNo = "**** **** **** " + kKno.substring(12);
        return yeniKkNo;


    }
}
