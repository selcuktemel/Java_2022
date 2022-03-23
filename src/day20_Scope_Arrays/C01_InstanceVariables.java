package day20_Scope_Arrays;

public class C01_InstanceVariables {
    int sayi;
    String bransIsmi = "Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi=10; sayi variable statik olmadıgı için main methoddan DİREKT kullanılamaz
        // instance variablara statik methodlaradan ulasabilmek için obje olusturmamız gerekir.
        // statik olmayan bir variable ulasmak için obje olusturmamız gerekir.

        C01_InstanceVariables obje1 = new C01_InstanceVariables();// bu class ın bir objesini olusturduk
        // bu ne işimize yarayacak; System.out.println(obje1.); nokta dersem

        System.out.println(obje1.sayi);//0
        obje1.sayi = 10;// bu öğretmenin adı gibi sadece öğretmeni baglıyor.
        System.out.println(obje1.sayi);//10
        obje1.bransIsmi = "SQL";
        System.out.println(obje1.okuldaMi);//false


        C01_InstanceVariables obj2 = new C01_InstanceVariables();
        System.out.println(obj2.sayi);// burada da 0 yazar obj2 nin olusturulmasıyla class leveldeki sayısını getirir. ,
        // deger atanmadıysa 0 default degerini alir.
        System.out.println(obj2.bransIsmi);// Java


        obje1.okuldaMi = true;
        System.out.println(obj2.okuldaMi);//eger verimizin basinda statik yazmıyorsa başka onjelerde ona
        // deger atanması beni ilgilendirmez sadece kendi oojesi içindeki atama yapılıp yapılmadıgına bakar.
        //orada da atama yapılmamıssa class level e gider . oradaki atamaya göre deger alır deger yoksa defaul deger alır.


    }
}
