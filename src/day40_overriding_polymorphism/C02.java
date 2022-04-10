package day40_overriding_polymorphism;

public class C02 extends C01 {
    @Override
    public void method2() {

        /*

    @Override notosyonu ovirriden method ile overriding method'u birbirine baglar Farkinda olunmadan overriden method silinitse veya signature degistirilse
    bu iliski bozulacagı icin java CTE verir
    Notosyon kullanılmazda Java bunları iliskisini bilir ama overriden method silinirse sesini cıkarmaz

         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        C02 obj = new C02();
        obj.method1();//parent method1
        obj.method2();//Child method2

        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//Child method2 override

        C01 obj3=new C01();// bu objede benim childla ilgimiz yok.
        obj3.method1();//parent method1
        obj3.method2();//parent method2

    }


}
