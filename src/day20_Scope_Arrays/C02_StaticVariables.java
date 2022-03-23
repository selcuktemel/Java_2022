package day20_Scope_Arrays;

public class C02_StaticVariables {
    // ınstance variablelar objeye bagımlıdırlar ve her obje arkli degerler alabilir.
    //  ogrenci notlari veya ögretmen bransları gibi
    // bir objeye ait bir variable'ın son degerini bulmak için sadece o objeyi dikkare aliriz

    /*
    static variableler ise clas variable olarak tanımlarnır ve tüm class üyeleri için aynidir.
    okul ismi okul müdürünün adi gibi eger satatik variablenin degeri
     */


   static String okulIsmi="Yildiz Koleji";
   static int okulNo;
   static boolean okulAcikMi;

    public static void main(String[] args) {

        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false
//eger asagıdaki methodu cagırmazsak çalışmayacaktır.//main methodun içinde calısmasını istediğimiz methodun ismini yazmamız yeterli
        staticMethod();
        System.out.println(okulNo);//


    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200

    }
}
