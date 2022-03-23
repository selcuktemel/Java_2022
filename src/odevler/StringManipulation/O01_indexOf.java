package odevler.StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class O01_indexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle alin
        // ve asagidaki uc durumdan uygun olani yazdirin
        // 1- cumle java icermiyor
        // 2- cumle 1 tane java iceriyor
        // 3- cumlede birden fazla java var

       Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scan.nextLine();

        int ilkJava=cümle.indexOf("java");
        int sonJava=cümle.lastIndexOf("java");

        if(ilkJava==-1){
            System.out.println("cümle java icermemektedir");
        }
        else if( sonJava==ilkJava){
            System.out.println("cümlede bir tane java vardır");
        }
        else {
            System.out.println("cümlede birden çok java vardır");
        }
    }
}
