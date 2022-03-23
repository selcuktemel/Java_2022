package day19_doWhileLoop;

public class C05_Scope {

    //1-bir method içerisinde olusturulan variableler sadece olusturuldukları
    // methodda kullanılabilirler baska methodlarda kullanılamazlar
    //2-tüm methodların kullanabilmesini istediğimiz variable'lari class level de olustururuz.
    // böylece olusturdugumuz tüm methodlar görebiilir
    //3- eger class levelde olusturdugumuz variable ı
    // -----statik yaparsak tüm methodlar kullanabilir.
    //----- statik olmazsa (intance) o zaman sadece static olmayan methodlar kullanabilir
    //4-loop içinde olusturulan variableler loop içerisnde kullanılabilir ama loop'un dıdısnda kullanılamaz.

    static String kurs="java";
    int level=10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi=10;
        System.out.println(kurs);// statik oldugu için tüm methodlarda kullanabiliyorum
       // System.out.println(level); statik olmadığı için statik method içinde kullanılamıyor
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopSayi=20;
        }
       // System.out.println(i); for içinde olmadıgı için görmez
        //loopSayi=30;

        int sayi2;
        sayi4++; //class seviyesinde olusturup deger atamadıgım sayi'u artırmama java itiraz etmiyor
        //sayi2++ ama main method içinde olusturup deger atamadıgım sayiyiyi artımama java izin vermiyor.


    }

    public static void method1() {
        System.out.println(kurs);/// statik oldugu için tüm methodlarda kullanabiliyorum
        // System.out.println(level); statik olmadığı için statik method içinde kullanılamıyor

    }

    public void method2() {
        System.out.println(kurs);// statik oldugu için tüm methodlarda kullanabiliyorum
        System.out.println(level);// kullanılan method statik olmadıgı için kullanılabilliyor
    }
}

