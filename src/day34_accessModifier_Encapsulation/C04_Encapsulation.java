package day34_accessModifier_Encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*
        bir variableyi encapsule etmek icin
         1. Access modifieri private yaparız
         2. okuma ve yazma ozelliklerinin kullanmasini istedigimiz gibi sınırlayabilir
           - eger sadece okunmasini istiyorsaniz getter
           - sadece deger girilebilsin isterseniz setter
          methodlarini olustururuz
          Bir variable icin hem getter hem setter olusturursaniz o varible public
          olmus gibi hem okuyup hem de yazilmasını saglayabilirisiniz.
         3.
         */
        C03 obj = new C03();
        System.out.println(obj.getSayi());//0
        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());

        System.out.println(obj.toString());
    }
}
