package day45_interface_;

public class C02_Default_Static_Method implements I01_Default_Static{

    /*
    BİR İNTERFACE'DE DEFAULT VEYA STATİC OLARAK TANIMLANAN VE BODY'SŞ OLAN METHODLARIN
    OVERRİDE EDİLMESİ MECBURİ DEĞİLDİR.
    static olarak tanımlanmıssa zaten override edemeyiz
     */
    @Override
    public void method1() {
        System.out.println("child class method1");

    }

    public static void main(String[] args) {
        //interfacedestatic olarak tanımlana  methodlara static yontemlerle ulasilabilir interfaceIsmi.methodIsmi
        I01_Default_Static.method3();
        C02_Default_Static_Method obje1=new C02_Default_Static_Method();
        obje1.method1();//child classdan calisacaktir.
        obje1.method2();//Parent interfaceden gelecek
        //obje1.method3(); eski classlarda static bir uyeye static olmayan yollarla da ulasbilirdik ancak interface
        //icerisinde static olarak tanımlanan method'a static olmayan yontemlerle ulasilamaz.



    }
}
