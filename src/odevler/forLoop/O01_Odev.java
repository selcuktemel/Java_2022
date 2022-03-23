package odevler.forLoop;

import java.util.Scanner;

public class O01_Odev {
    public static void main(String[] args) {
        /*
        Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren

bir method yazin.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        tertenMethod(kelime);
    }
    private static void tertenMethod(String kelime) {
        String terstenYazilis="";// bunu niye olusturduk.
        // kelimenin son index degeri                                          ** length()-1'İ her seferinde bir kere azalt
        for (int i = kelime.length()-1;                 i >=0 ;                     i--) {
                                                      //kelime.legnt()-1 0
                                                      //0 olan akadar çalısacak
                                                      // 0 olunca duracak
            System.out.print(kelime.substring(i,i+1));
            // yazdırırken nasıl yaptım.
            // i length()-1 e eşitti, yani son index'e
            terstenYazilis+=kelime.substring(i,i+1);
        }
        System.out.print(terstenYazilis);
    }
}
