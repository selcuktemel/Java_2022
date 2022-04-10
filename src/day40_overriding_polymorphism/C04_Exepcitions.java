package day40_overriding_polymorphism;

public class C04_Exepcitions {
    public static void main(String[] args) {
        /*
        String olarak verilen bir sayiyi integer'a cevirip 2 katini ekrana yazdiralim
         */
        String str = "1234a";

        /*str icinde sayi olmayan bir karakter olursa
        NumberFormatException.forInputString verir */


        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati : " + 2 * sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Girdginiz String sai olamayan elementler iceriyor");

        }

    }
}
