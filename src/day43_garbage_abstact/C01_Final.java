package day43_garbage_abstact;

public class C01_Final {




    /*
        pi sayisi gibi hiç degistirilemsini istemediğiniz bir sayi var ditelim

         */

    final  static double piSayisi=3.14;
    // her yerden ulasşmak için static yaptık anacak final oldugu icin değistirmelere karşi korunuyor.
    final static String okulAdi="Yildiz Koleji";



    public static void main(String[] args) {
        //okulAdi="Java Koleji";
//final olarak isaretlendigi icin degistirilemez ulasılabilir ancak degistirilemez.







        final int sayi=10;
        //sayi=20;
        //Cannot assign a value to final variable 'sayi'
       // 'sayi' final değişkenine bir değer atanamıyor


    }
    public static final void method1(){
        System.out.println("Parent Class final method1");
    }
}
