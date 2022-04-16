package day45_interface_;

public interface I01_Default_Static {

    /*
    interfacelerde sadec abstract method'lar bulunur.
    Body'si olan concrete bir method olusturmak istediğimizde java CTE verir.
    Ancak java8 ve uzeri versiyonlarda, istisnai olarak static veya default olarak tanımlanan methodlarin body'si olabilir.

    ancak burada kullanılan default keyword'u access modifier degildir.
    cunku ınterface'lerde tum methodlar public ve abstract'tır.

    Asagıdaki ornekte gorulecegi gibi default olarak ranımlanmıs bir method'a access modifier olarak public yazabilirsiniz
    (access nodifier yazmasak da Java methodu public olarak kabul edecektir.)
     */

    void method1();
  public  default void method2(){// basina defaul yazınca itiraz etmeyi bıraktı
      System.out.println(" Interface'deki default method");

    }
    static void method3(){/*// basina static yazınca itiraz etmeyi bıraktı STATİC METHODLARA OVİRRİDE EDİLEMEZLER*/

    }
}
