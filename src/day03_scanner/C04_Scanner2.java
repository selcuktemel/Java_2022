package day03_scanner;

import java.util.Scanner;

public class C04_Scanner2 {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("yarıçap giriniz");
        double yarıcap=scan.nextDouble();

        System.out.println("girdiğiniz yariçap :" + yarıcap);
        System.out.println("Çember Çevresi :"+ (2*3.14)*(yarıcap));
        System.out.println("Çember alanı :"+ (3.14)*(yarıcap*yarıcap));

    }
}
