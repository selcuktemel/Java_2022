package day39_overriding;

public class Coralla extends Toyota {


    protected String hiz = "Corolla maz 200 km hiz yaparlar";
    protected String yakit = "Coralla benzinli veya elektiriklidir ";
    protected String model = "Coralla";


    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanır");
    }

    public void yakitTuketimi() {
        System.out.println("Coralla 5.6 litre yakit tüketir");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 viteslidir.");
    }

    public static void main(String[] args) {

        /*
         DATA TÜRÜ VE CONST FARKLI OLDUGUNDA CONTR CALISTIGI İCİN CONTRUCTUN OLDUGU CLASS OZELLİKLERİNİ TASİR(aralarında Parent Child iliskisi olmali)
         ANCAK DATA TÜRÜ PATENT CLASS SECİLDİGİ İCİN VARİABLELAR, DATA TÜRÜNÜN SECİLDİĞİ
         CLASS VE ONUN PARENT CLASSLARINDAN DEGER ALABİLİR.*** mutlaka parent child class iliskisi olali***
         */
        // methodlar icin ise yine data türünün Oldugu classa gideriz ancak direkt methodu calistirmadan once method OVERRIDE edilmis mi diye kontrol ederiz
        // OVERRIDE: parent classda var olan bir methodun aynısını child classda olusturmak demek.
        //
        //
        //
        //
        Coralla araba1 = new Coralla();
        System.out.println(araba1.hareket);// hareket hangi clasda varsa ordan alırız.Araba Class
        System.out.println(araba1.hiz);// bu classda hız varsa burdan alır baska yere gitmez. Corolla Class
        System.out.println(araba1.yakit);// Corolla Class
        System.out.println(araba1.marka);//Toyota Class
        System.out.println(araba1.sirketMerkezi);//Toyota Class
        System.out.println(araba1.model);//Corolla Class
        araba1.motor();// Corolla



        Toyota araba2 = new Coralla();
        System.out.println(araba2.hareket);//Araba Class
        System.out.println(araba2.hiz);//Toyota Class
        System.out.println(araba2.yakit);// Araba Class
        System.out.println(araba2.marka);//Toyota Class
        System.out.println(araba2.sirketMerkezi);//Toyota Class
        // System.out.println(araba2.model);***CTE***//Toyota classından baslAYARAK modele bakar kendi classında yoksa
        // ParenT Classa bakar orada da yoksa asagıya DOGRU BAKMAZ ve CTE olarak bize doner.
        araba2.motor();// Corolla
        araba2.garanti();// Toyota
        araba2.yakitTuketimi();//Corolla
       // araba2.vitesSayisi(); data türü olan Toyotadan baslayınca boyle bir method bulamadık CTE

        Araba araba3 = new Coralla();
        System.out.println(araba3.hareket);// Araba Class
        System.out.println(araba3.hiz);// Araba Class
        System.out.println(araba3.yakit);// Araba Class
        System.out.println(araba3.marka);//Araba Class
        /*System.out.println(araba3.sirketMerkezi);//CTE
        // System.out.println(araba3.model);//CTE*/
        araba3.yakitTuketimi();//Corolla
        araba3.motor();//Corolla
        //araba3.garanti();CTE aramaya Araba clasından basladı bulamadı geriye dönemez.
        //araba.vitesSayisi //CTE


    }

}
