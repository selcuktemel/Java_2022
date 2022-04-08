package day39_overriding;

public class OverridingChild extends OverridingParent {
    public  void method1() {
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

              /*
        Mehmet Hoca 1.
    Bir obje olusturulurken Data turu ve Constructor ayni class'dan secilmisse
    Java direk o class'a gider
    hem variable hem de method icin
    o class'da varsa kullanir, yoksa o class'in
    parent'larina bakar.
     *///OverridingChild obje1=new OverridingChild();

       OverridingChild obje1=new OverridingChild();
       obje1.method1();// basına bi sey yazmadıgımız icin bulundugu clasdan alır
        //Child class method1
        obje1.method2();//Parent class method2


      /* Mehmet Hoca 2. Eger Data turu Parent, Constructor Child class'dan secildiyse
      variable'larda yukaridaki sekilde calisma devam eder
      Ancak--> Method'lar icin Data turunun oldugu class'daki method
      Child class tarafindan OVERRIDE edilmis mi diye kontrol etmemiz gerekir
      Eger child class'larda bu method override edilmisse
      override eden method calisir
       *///OverridingParent obje2=new OverridingChild();

        OverridingParent obje2=new OverridingChild();
        obje2.method2();//Parent class method2
        obje2.method1();//Child class method1
        /* OVERRİDİNG'IN FARKİ data türünü OverridingParent'den sectik, Construtor'ı OverridingChild()'dan sectik
        dolayısıyla java Parent Classa GİDER . ORADA method1() oldugunu görür ama hemen calistirmaz control eder derki
        acaba Child CLASS'da ezildi mi bunu control eder. Ezildiyse kim ezdiyse onun method1()i calisir.
        */

        OverridingParent obje3=new OverridingParent();
        obje3.method2();//Parent class method2
        obje3.method1();// Parent class method1
       // Data türünü OverridingParent'den sectik, Construtor'ı OverridingParent'den sectik
        //java OverridingParent'a gidecek orada method2() var mı var, constructor'da Parendan oldugu icin
        //her ikisi de parent olur.

        /*
        Eger Const. Child clasdan secilmişse METHODALAR calistirilmadan once Override edilmiş mi kontorl eder.
        OverridingParent obje2=new OverridingChild(); obje icin once Parente gider. methodu bulur. ama calıstırmadan once
        const child oldugu icin gidip override edildi mi diye kontrol eder(child clasa gider.)
         */


    }
}
