package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {

        // kullanıcıdan kacıncı ay olduğunu alıp mevsimi yazdıran bir switch olusturun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kacıncı ayda olduğumuzu giriniz");
        int ayNo = scanner.nextInt();

        switch (ayNo) {
            case 12, 1, 2:
                System.out.println("kıs");
                break;
            case 3, 4, 5:
                System.out.println("ilkkbahar");
                break;
            case 6, 7, 8:
                System.out.println("yaz");
                break;
            case 9, 10, 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("lütfen geçerli bir secim yapiniz");
        }

    }
}
