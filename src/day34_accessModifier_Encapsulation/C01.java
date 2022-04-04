package day34_accessModifier_Encapsulation;

public class C01 {
    private static int sayi = 10;
    private static String str = "Java";
    static int acikSayi = 20;// clas ismi ile çagırabiliriz
    String acıkStr = "Hi";// C2 den obje ile cagıracilirriz
    public static int halkaAcikSayi = 15;

   protected C01() {
// bu constructor un Access madifieri yazilmadigi icin defaul access modifierdir.
        // dolayisi ile içinde oldugumuz paket dıdında bu clasdan obje olusturulamaz.
    }

    private C01(int numara) {
        System.out.println("parametreli cont. calisti");
    }

    private void method() {

    }

}
