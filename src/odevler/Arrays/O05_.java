package odevler.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class O05_ {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cummle giriniz");
        String cumle = scanner.nextLine();

        String yeniCumle[]=cumle.split(" ");
        System.out.println(Arrays.toString(yeniCumle));

        System.out.println("cümledeki kelime sayisi : "+ yeniCumle.length);


    }
}
