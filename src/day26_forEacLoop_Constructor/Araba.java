package day26_forEacLoop_Constructor;

public class Araba {
    /*
     Javada her class olusturdugumuzda java o class'dan ileride objelerden
     üretmek gerekeceğini bilir ve bir özellğini belirtmesek de Java jher olusturgugu
     classa bir constructor koyar.

     Javanın class olustururken class'a koydugu constructora DEFAUL CONSTRUCTOR denir ve bu constructor görünmezz

     Eger biz görünür bir constroctor imiz olasun istersek default constructor ile ayni görevi yapan bir constructor olusturabiliriz
     veya istersek ayni kapliptan farkli desenlerde objeler olusturmak için farklı özllerde constructorlar da olusturabilriiz.

     constructorlari birbirinden farklılastıran tek ayrilacik kullanilan parametre sayisi ve paramaetre data türüdür.

     */

   public Araba() {
       System.out.println("parametresiz constructor calisti ");

    }
// kod blogunun method veya constructor olamsından emin olmak istiyorsaniz
    // iki şeye dikkat etmelisizn.
    //1- Constructorlarin ismi class ismi ile ayni olmak zorundadir. ve Class ismi BUYuk HARFLE baslar,
        //Method isimleri ise kücük olmak i
    //2- Constructorların return type olmaz. return type varsa methoddur.

    //özet: constructor'un adı Class adi ile ayni olmali ve return type olmamli

public Araba(String renk){// constructor tek parametreli String.
    System.out.println(renk+" renkli bira araba üretildi");
}
public Araba(int yil){// constructor tek parametreli int.
    System.out.println(yil+" model bir araba uretildi");
}
public Araba(int yil,String renk){// constructor iki parametreli int, String.
    System.out.println(yil+" model" +renk+ " bir araba uretildi");

}


}
