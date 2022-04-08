package day38_inheritance_overriding;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Isci {
    String statu = "Ustabasi";
    String haklar = "Ustabasi haftadi  birgün ekstra tatil hakkina sahiptir.";





    public void mesai() {
        System.out.println("Ariza varsa Usta basi eksta maas alamadan calisir");
    }


    public void maas() {
        System.out.println("Ustabasi 30 gün *8 saat*12 euru= " + (30 * 8 * 12) + "Euruo maas");
    }

    public static void main(String[] args) {
        /*icinde oldugumuz classdan klasik haliyle bir obje olusturursak o obje ile cagırdgımız variable ve method'larda
        Java once icinde bulundugumuz calss'a bakar aradıgımız class uyesi, icinde oldugumuz class'da varsa bize onu getirir.
        Yoksa?
         Parent claslara bakar ve ilk buldugunu getirir*/
        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftadi  birgün ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);//Isciler yilda bir ikramiye alır (Isci Clasından getiridi.)
        System.out.println(yasin.izin);// Tüm personel yılda 4 hafta izin kullanabilir(Personel Classından getirdi.)
        yasin.maas();
        yasin.mesai();
         /*
         isci olarak ozelliklerini görmek istersek.Class adını (Data Turu) isci seceriz.asagıdaki gibi yaparsak bize Isci ile ilgili bilgileri getirecektir.
         Isci ahmet = new Ustabasi(); --> bu obje ilk once Ustabası() const. a gider ve ustabasi ozellikerlini kazanır.bunun dısında Ustabası Clası ile bir ilgisi olmaz.
          ancak Isci Classıyla muhatap olur ve ordan gelir. */

        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu);//Ustabasi (once bu classa baktı ve bu clasdaki statuyu buldu ve yazdırdı)-------
        System.out.println(ahmet.haklar);//Ustabasi haftadi  birgün ekstra tatil hakkina sahiptir.(once bu classa baktı ve bu clasdaki haklari buldu ve yazdırdı)------
        System.out.println(ahmet.ikramiye);//Isciler yilda bir ikramiye alır
        System.out.println(ahmet.izin);//Tüm personel yılda 4 hafta izin kullanabilir(Personel Classından getirdi.)
        ahmet.maas();
        ahmet.mesai();
        /*
          bir insani Personel olarak tanımladıysak, artık onun isci haklarından bahsedemezsiniz. Personel haklarından faydalanabilir.
          bir objeyi hangi clastan tanımlarsanır o classın ozellikleri kazanır. Biz Personelden bahsederken yani Personel olan ademden bahsederken;
          Statüsü personel olur,Personel hakları tüm personel esit haklara sahiptir olur. onemli adem.ikramiye tanımlarsak adem Personel clasının bir uyesi
          oldugundan personel Clasına ait ozelllikeler sahiptir. Personel Classı parent oldugundan childlarının ozelliklerini almaz. yani adem.ikramiye isci classına
          ait bir ozellik oldugu icin burada hata alırız.
        */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tüm personel esit haklara sahiptir olur
        // System.out.println(adem.ikramiye);//burası CTE verir.
        System.out.println(adem.izin);//Tüm personel yılda 4 hafta izin kullanabilir(Personel Classından getirdi.)
        adem.maas();
        adem.mesai();

       /*
       Personel adem = new Ustabasi(); bu bir ustabasi objesidir.
       constructor Ustabasi() ise asagıdaki 1 ve 2 'yi yazdirir
       1. Ustabasi 30 gün *8 saat*12 euru= 2880Euruo maas
       2. Ariza varsa Usta basi eksta maas alamadan calisir
       Personel adem = new Personel(); bu personel objesidir.
       Constructor Personel(); oldugunda


        */
       /*
       Personel adem=new Ustabasi();(burada adem ustabasidir.)
       buraya Personel yazdik ama biz data typedan bahsediyoruz. nasıl oluyor?
       ilk dersten beri söyledigimiz sey bir assingment varsa =
       sag taraf yani new Ustabasi(); burası deger
       Soltaraf yani Personel adem --> burada Personel data türü adem ise variable ismidir.
       String str="ali";
       Integer ars=444;
       Persone adem= new Personel();
       YANİ BÜYÜK Harfle baslayan her DATA türü aslında bir CLASS (uyanmaya başladık)
        */

        // Personel adem=new Ustabasi();  ademi'in datatürü Personeldir. boylece biz ademi ne olarak isimlendiridimizi bilebilriiz
        // Ancak ben adem'in Ustabasi oldunu biliyorum. cunku constructor u Ustabasi();
        // Ama bu yazım formati ile adem'in tum personel ile birlikte sahip oldugu sahip oldugu ortak ozellikleri vurgulamak istiyorum.
        // bu kullanım seklinde, olusturlan obje data türü olarak secilen class ve onun parernt classlarındaki variableleri kullanabilir.

        // constructor u Ustabasi'ndan secmissek bir ustabasi olusturudumuzu biliyoruz.  Ama adem'in her ne kadar ustabasi olasada bir personel olrak var olan ozelliklerini görmek istiyoruz
        //0 zamn objeyi böyle olusturuyorum. /*Personel adem=new Ustabasi();


        /*
        dataTürü olarak sectigimiz ne ise Ustabasi,Isci, Personel her neyse, variable icin baslangıc noktası o classdır.
         */
       // List<String> ustabasi = new ArrayList<>(); burada biz aslında bir ArrayList olusturduk ama aslında List ozelliklerini kullnadık
       // Personel kelam =new Ustabasi(); // buradada biz bir Ustabası olusturduk ama Personle ozelliklerinikullandık
    }
}
