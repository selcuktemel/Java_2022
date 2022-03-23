package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        //Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome
        // olup olmadigini kontrol eden bir method olusturun

        //palindrome yazılan kelimenin, sayının tersten okunası da aynı olmasıdır.

        String input="Madam";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length() - 1; i >= 0; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi : "+ terstenInput);

        if(input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime palindrome");
        }else {
            System.out.println("girdiginiz kelime palindrome degil");
        }


    }
}
