package day06_concatentionoperat_operators;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
// variable ların değerlerini değiştirmeden bu variableleri kullanarak yazdıırn
        //java5Guzel
        System.out.println(str1+sayi1+str2);
        //2Güzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        //Java22
        System.out.println(str1+(sayi1*sayi2+sayi1*sayi2 -(sayi1+sayi2)));
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));// Java22
//53Güzel
        System.out.println(sayi1+""+sayi2+str2);
        System.out.println(""+sayi1+sayi2+str2);
// EGER tamamen sayılardan oluşan bir bir strin varsa bunu inta cerirmek istersek Wrapper Classı kullanıyorduk
// Integer.valueOf(str)
// bir sayıyı Stringe çevirmek istersem ""+sayı yaparım ...

    }
}
