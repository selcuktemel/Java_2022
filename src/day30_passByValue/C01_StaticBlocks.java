package day30_passByValue;

public class C01_StaticBlocks {
//class calısmaya baslamadan yapmamiz gereken on atamlar varsa onlari yapar. PRE-Condetion da denir
//yazildigi satirin hiçbir önemi yoktur.
// herkesten ve herseyden once calisir. (static block)
// araba calısmaya başlamadan once yapılan hazırlıklıkları yapıyor mus gibi dününün
// main method olmasa calışmaz. her zaman main methoddan başlar çalıstırma islemi.
    static{
        System.out.println("Static block1 calıstı");
   }
   static {
       System.out.println("static block2 calisti");
       //static block birden fazla olursa blocklar yukaridan asagi dogru sirayla calisir.
   }

    public C01_StaticBlocks() {// ilk etapta çalismadi obje olusturmadimiz için

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslagici");
        C01_StaticBlocks obje1;
        new C01_StaticBlocks();//constructor parantezini nerede görürsek orada çalısır.
                              // parantezli olan görünmüyorsa Constructor calismaz.
        System.out.println("main method sonu");
    }

}
