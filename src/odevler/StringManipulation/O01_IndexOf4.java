package odevler.StringManipulation;

import java.util.Scanner;

public class O01_IndexOf4 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // Kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cumle gririniz");
        String cumle= scanner.nextLine();;
        System.out.println("bir kelime giriniz");
        String kelime= scanner.next();

        if(cumle.indexOf(kelime)>=0){
            System.out.println("girilen kelime = " + kelime+" cümle içinde geçmektedir");
        }else if(cumle.indexOf(kelime)<0){
            System.out.println("girilen kelime = " + kelime+" cümle içinde geçmememktedir.");
        }else {
            System.out.println("girilen kelime = " + kelime+" cümle içinde birden fazla geçmektedir.");
        }

    }
}
