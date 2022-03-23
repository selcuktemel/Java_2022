package odevler.StringManipulation;

import java.util.Scanner;

public class O06_length {
    public static void main(String[] args) {
        // Kullanicidan bir String girmesini isteyin
        // girilen String'in
        // 1 son harfini buyuk harf olarak yazdirin
        // 2 bastan 3 üncü harfini kücük yazdirin, 4 üncü harfini büyük
        // 3 sonrdan 4 üncü harfini kücük yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime veya bir cümle giriniz");
        String cumle=scanner.nextLine();


        System.out.println("girdiginiz cümlenin son harfi : " + (cumle.toUpperCase().charAt(cumle.length()-1)));
        System.out.println("girdiginiz cümlenin bastan ücüncü ve dorduncu harfi : " +cumle.toLowerCase().charAt(3)+cumle.toUpperCase().charAt(4));
        System.out.println("girdiginiz cümlenin sondan dorduncu harfi : " + (cumle.toLowerCase().charAt(cumle.length()-4)));



    }
}
