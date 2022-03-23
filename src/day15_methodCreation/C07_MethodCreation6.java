package day15_methodCreation;

public class C07_MethodCreation6 {
    public static void main(String[] args) {


        //string'i yazdiran methodu olusturalim
        // hosgeldiiz diyen bir method olusturun
        // kapanma mesajı yazan bir method olusturun

        hogeldinYazdir();
    }

    private static void kapanmaMethodu() {

        System.out.println("Bizi tercih ettiğiniz için teşşekür ederiz");
    }

    public static void hogeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Böyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
