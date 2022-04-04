package day34_accessModifier_Encapsulation;

public class C02_accessModifier {
    public static void main(String[] args) {

        C01 obj1=new C01();
        obj1.acıkStr="Bye";
        C01.acikSayi=50;

       // C01.sayi=15; private access m0difieri oldugundan baska classdan erisilmez
        //obj.method private access m0difieri oldugundan baska classdan erisilmez
       // C01 objeParametreli=new C01(5);private access m0difieri oldugundan baska classdan erisilmez
    }
}
