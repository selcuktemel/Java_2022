package odevler.odev_03;

import java.util.Scanner;

public class O08_GunIsmiBuyukKucu {
    public static void main(String[] args) {
//Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
//isminin 1.,2. ve 3.harflerini buyuk digerleri kucuk olarak yazdirin, gun ismi
//gecerli degilse “Gecerli gun ismi giriniz” yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("Gun ismini giriniz");
        String gun= scan.next().toUpperCase();

        if ((gun.equals("PAZATESI")||(gun.equals("SALI")||(gun.equals("CARSAMBA")||(gun.equals("PERSEMBE")||(gun.equals("CUMA")
                ||(gun.equals("CUMARTESI")||(gun.equals("PAZAR")))))))))
        {
            System.out.println (gun.toUpperCase().substring(0,3) + gun.toLowerCase().substring(3));
        }
        else {
            System.out.println("Gecerli gun ismi giriniz");
        }
scan.close();
    }
}
