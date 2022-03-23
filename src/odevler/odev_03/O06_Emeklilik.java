package odevler.odev_03;

import java.util.Scanner;

public class O06_Emeklilik {
    public static void main(String[] args) {
        //Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        //calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println( "yasinizi giriniz");
        int yas =scan.nextInt();
        if (yas >0)
        {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            }
            else {
                System.out.println("emekli olamazsın");
            }

        }
        else
        {
            System.out.println("girdiğiniz değer 0 dan küçük olmaz");
        }
    scan.close();
    }
}
