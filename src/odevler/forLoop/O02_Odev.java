package odevler.forLoop;

import java.util.Scanner;

public class O02_Odev {
    public static void main(String[] args) {
        /*
        Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();

        for (int i =kelime.length()-1; i >=0 ; i--) {

            //System.out.print(kelime.substring(i,i+1));// kelime variablenin ilk harfinden baslayarak yazdıracagımız için her seferinde 1 harfini yazdıracak
            System.out.print(kelime.charAt(i));
            //bu daha anlasılır
        }

    }
}
