package odevler.forLoop_;

import java.util.Scanner;

public class ForLoop6 {
    public static void main(String[] args) {
        //kullanıcıdan bir strin isteyin Kullanıcının girdigi String'in palindrome olup olmadıgını kontol eden java programı yazın
        //palindrome terseten de yazlılısı aynı demek
        //bir method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String palindrome = scanner.next();

       KontrEt(palindrome);
    }

    private static void KontrEt(String palindrome) {
        String terseten ="";
        for (int i = palindrome.length()-1; i >=0 ; i--) {
            terseten +=palindrome.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi : "+ terseten);
        if (palindrome.equalsIgnoreCase(terseten)) {
            System.out.println("girdiginiz kelime palindrome");
        }else{
            System.out.println("girdiginiz kelime palindrome degil");
        }



    }
}
