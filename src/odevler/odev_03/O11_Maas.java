package odevler.odev_03;

import java.util.Scanner;

public class O11_Maas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("teklif ettiğiniz maasi giriniz");
        double maas=scan.nextDouble();

        if (maas >=80000) {
            System.out.println("teklifi kabul ediyorum");
       }
        else if  ((maas<80000)&&(maas >=60000)) {
            System.out.println("konusabiliriz");
        }
        else if (maas <60000) {
            System.out.println("başka kapıya");
        }
        else{
            System.out.println("lütfen geçerli bir değer giriniz");
        }
        scan.close();
    }
}
