package day09_ternary_Switch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //kullanıcıdan ayları girmesini isteyiniz ve hangi ayda olduğumuzu yazdırınzı

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen içinde bulundugunuz ayı gırınız");
        int ay=scan.nextInt();

        switch(ay){
            case 1 :
                System.out.println("Ocak");
            break;
            case 2 :
                System.out.println("Subat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayis");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasım");
                break;
            case 12 :
                System.out.println("Aralık");
                break;
            default :
                System.out.println("lütfen gecerli bir ay giriniz");

        }
    }
}
