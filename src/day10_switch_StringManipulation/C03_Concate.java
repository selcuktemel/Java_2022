package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

// concatination yapmak içiniki ihtialimiz var istersek daha önce yaptığımız gibi + operatörünü kullanabiliriz
        // veya String classından gelen concat method'unu kullanabiliriz.
        String str1="Java";
        String str2="Candir";

        //Java Candir yazdiralim
        System.out.println(str1 +" "+ str2);

        String cumle=str1.concat(str2);//JavaCandir

        cumle=str1.concat(" ").concat(str2);// Java Candir

        System.out.println("cumle = " + cumle);
        // concat icine String degil de sayi veya boolean deger yazsak
        
        cumle=str1.concat(str2);
        System.out.println("cumle = " + cumle);
    }
}
