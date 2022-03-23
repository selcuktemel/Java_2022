package odevler.StringManipulation;

import java.util.Scanner;

public class O01_IndexOf1 {
    public static void main(String[] args) {
//Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
//olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cumle gririniz");
        String cumle= scanner.nextLine();;
        System.out.println("bir harf giriniz");
        String harf= scanner.next();

        System.out.println(cumle.indexOf(harf));


    }
}
