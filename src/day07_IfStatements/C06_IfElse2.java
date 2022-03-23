package day07_IfStatements;

import java.util.Scanner;

public class C06_IfElse2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir gun giriniz");
        String gun=scan.next().toUpperCase();

        if (gun.equals("PAZAR")||gun.equals("CUMARTESI")) {// gun variablenin tamamını toUpperCase(); ile büyük yapyığımız için değere de büyük harfle giriş yapmalıyız.
            System.out.println("hafta sonu");
        }
        else {
            System.out.println("hafta ici");
        }
    }
}
