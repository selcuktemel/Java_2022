package day02_variables;

public class C02_Variables2 {
    public static void main(String[] args) {
        // java çalışmaya main methottan başlar sonra
        // yukarıdan aşağıya soldan sağa doğru çalışır.

        // eğer istersek bir variable ı önce daklare edip sonra değer atayabiliriz

        String okulIsmi ;
        //java değr ataması yapmadığımız bir variable oluşturmamıza itiraz etmez ancak
        //değer  ataması yapıncaya kadar o variable'ı kullanmamıza izin vermez
        //System.out.println(okulIsmi);

        // println ile print arasındaki fark
        // println'de yazdırma işleminden sonra alt satira geçer
        //print'de yazdırmadan sonra alt satıra geçmez yana devam eder.


        okulIsmi="Yıldız Koleji";
        System.out.println(okulIsmi);
        okulIsmi ="Star Koleji";
        System.out.println(okulIsmi);
        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);

    }
}
