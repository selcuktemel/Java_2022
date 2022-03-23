package odevler.StringManipulation;

import java.util.Scanner;

public class O01_indexOf5 {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();
        System.out.println("lütfen bir harf giriniz");
        String harf = scanner.nextLine();

        System.out.println(cümle.indexOf(harf));// consola girilen karakterin ilk bulunduğu indexi verdi
        System.out.println(cümle.indexOf(harf,11));// consola girilen karakterin 11 inci index dahil ve sonrasında arar indexini yazdırır

        int sonucIndex=cümle.indexOf(harf,9);// consola girilen karakterin 9 uncu index dahil ve sonrasında arar yazdırma yok
        System.out.println(sonucIndex);


    }
}
