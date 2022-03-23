package day07_IfStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici yanlis girerse "yanlis giris" yazdirin
//  Ornek:      gun=Pazar output = "Hafta sonu"
//      gun=Sali output = "Hafta ici"
//  *** String icin equals method'unu kullanin

// pazar veya cumartesi ise ===> hafta sonu
// pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gun ismini yaziniz");
        String gun =scan.next().toLowerCase();


        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }
        else if (gun.equals("pazartesi") ||gun.equals("sali")||gun.equals("carsamba") ||gun.equals("persembe")||gun.equals("cuma") ) {
        System.out.println("girdiginiz gun haftaici");
        }
        else {
            System.out.println("hatalı giriş!! lütfen geçerli bir gün giriniz");
        }
        // eger if else if .....  statement else bitiyorsa olasilıklardan sadece ve sadece bir tanesi mutlaka çalışır.
        // Java ilk bulduğu true'a ait sonucu yazdırır
        // ve kalan sartlara bakmaz.
        // if else if .... cümleleri else ile bitmese de çalışır ancak bu durumda sadece bir olasılık çalısabilir veya hiçbir islem yapılmayabilir

    }
}
