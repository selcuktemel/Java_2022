package odevler.odev_03;

import java.util.Scanner;

public class O03_HaftaSonuIci {
    public static void main(String[] args) {
      /*  ) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
*** String icin equals method’unu kullanin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String gun = scan.next().toUpperCase();

        if(gun.equals("PAZAR")||gun.equals("CUMARTESI")){
            System.out.println("HAFTA SOONU");
        }
        else if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") || gun.equals("PERSEMBE")||gun.equals("CUMA")) {
            System.out.println("HAFTA ICI");
        }
        else {
            System.out.println("LUTFEN GECERLI BIR GUN ISMI GIRINIZ");
        }
    }
}
