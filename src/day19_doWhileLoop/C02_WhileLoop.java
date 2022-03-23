package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi ailın ve bu sayinin rakamları toplamini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int input = scanner.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;

        while (input > 0) {
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
