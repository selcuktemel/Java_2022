package odevler.forLoop;

import java.util.Scanner;

public class O03_Odev {
    public static void main(String[] args) {
        /*
        Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        String terstenKelime="";

        for (int i = kelime.length()-1; i>=0 ; i--) {
            terstenKelime+=kelime.charAt(i);// terstenKelime variablenı kelime variablenın tersten yazılısını atadım.
//neden baska yerde değilde burada atama yaptım çünku bu bodyler içinde çalısıyor.

        }
        System.out.println(terstenKelime);
        if (kelime.equalsIgnoreCase(terstenKelime)){
            System.out.print("girilen kelime polindromedir");
        }
            else {
            System.out.println("girilen kelime polindrome değildir");
        }










    }
}
