package odevler.odev_03;

import java.util.Scanner;

public class O10_NotHesab {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        //50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
        Scanner scan=new Scanner(System.in);
        System.out.println( "Notunuzu giriniz");
        double not=scan.nextDouble();

        //1 50’den kucukse “D”
        if (not >0 && not <=100) {
            if (not <50) {
                System.out.println("Notunuz : DD ");
            }
            //50-60 arasi “C”,
            else if (not <60) {
                System.out.println("Notunuz : CC ");
            }
            // 60-80 arasi “B”
            else if (not <80) {
                System.out.println("Notunuz : BB ");
            }
            else if (not>80) {
                System.out.println("Notunuz : AA ");
            }
        }
        else {
            System.out.println("Geçerli bir not giriniz");
        }
scan.close();
    }
}
