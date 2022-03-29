package day30_passByValue;

public class C02_StaticBlocks {

    {/*
    Static olmayan blocklar onje olustulurken çalisir
    static blocklar sadece bir kere en basta calisir ama static olmayan blocklar her obje olusturulurken yeniden çalisir.
    */


        System.out.println("static olmayan block calisti");
    }//instance block. static olmayan block ne zaman çalısır
    // obje olusturursam çalisir.
    static{
        System.out.println("static block calisti ");//1inci bu çalıstı bidaha çalımayacak
    }

    public static void main(String[] args) {
        System.out.println("main method basi");// 2 bu çalıtı
        C02_StaticBlocks obj1=new C02_StaticBlocks();//3 bu çalıstı ve static olmayan block içine girip yazdirdi
        C02_StaticBlocks obj2=new C02_StaticBlocks();//4 caliti ve static olmayan block içine girip yazdirdi


    }
}