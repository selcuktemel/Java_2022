package day07_IfStatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        /*Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
  Ornek:  gun=Pazar output = “Hafta sonu”
 gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin
 gün pazar veya cumartesi ise hafta sonu
 pazartesi veya salı veya çarsamba veya persmbe veya cuna ise hafta içi
 */

        // String Case Sensitivedir.
        // pazar Pazar PAZAR bunlar hep farklı kelimelerdir.
        /// durumda String methodlarından yardım alırız
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen haftanın bir gününü giriniz");
        String gun= scan.next().toLowerCase();
// String ifadelerde == kullanılması tavsiye edilmez çünkü beklediğimizden farklı sonuç verebilir.
        if (gun.equals("pazar")||gun.equals("cumartesi")) {

            System.out.println("girdiginiz gun haftasonu");
        }
        if (gun.equals("pazartesi") ||gun.equals("sali")||gun.equals("carsamba") ||gun.equals("persembe")||gun.equals("cuma") ) {
            System.out.println("girdiginiz gun haftaici");
        }

    }
}
