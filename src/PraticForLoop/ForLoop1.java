package PraticForLoop;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        // Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo
        // kelimede geçen aynısı olmayan tekrarlamayan harfleri yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String str=scanner.next();

        for (int i = 0; i <str.length() ; i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {// sondan da bastanda harfin indeksi aynıysa yazdır. bastan farlı index sondan farklı indekse sahipse yazdırmaz
                System.out.print(str.charAt(i));

            }

        }




    }
}
