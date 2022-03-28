package day29_statikKeyword;

public class C02_StatikKeyword {// JAVA ÇALISMAYA BAŞLAR DURANA KADAR YAPMAYA BAŞLADIGI DEĞİŞİKLİKLER KALICI OLUR . DURDUGUNDA HERSEY ESKİ HALİNE DÖNER.
    public static void main(String[] args) {
        // baska classdaki static class uyelerine
        // ulasabilmek icin sadece classismi.staticUyeIsmi yazmamız yetereli

        System.out.println(C01_Static.okulTelefonu);//056498479

        C01_Static.okulTelefonu="053656456";
        System.out.println(C01_Static.okulTelefonu);//053656456

        //baska classdaki static olamyan class uylerine ancak o clasdan obje olusturarark ulasabiliriz
        //ve obje ile yapılan atamalar sadece o obje için yapılan atamalar sadece o obje için geçerli olur.

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulIsmi);// Yildiz Koleji
        obj2.okulIsmi="Sabir Koleji";// yaptıgımız değişiklik sadece obj2 i ilgilendirir.
        System.out.println(obj1.okulIsmi);// bu farklı bir obje oldugu için bu Yildiz Koleji yazdirir.
        System.out.println(obj2.okulIsmi);//Sabir Koleji.


  }

}
