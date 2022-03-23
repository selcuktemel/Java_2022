package odevler.odev_03;

import java.util.Scanner;

public class O07_Ucgen {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarını giriniz");
        double kenar1,kenar2, kenar3;
        kenar1 =scan.nextDouble();
        kenar2 =scan.nextDouble();
        kenar3 =scan.nextDouble();

        if (kenar1>0&&kenar2>0&&kenar3>0) {
            if (kenar1 == kenar2&&kenar2==kenar3) {
                System.out.println("Eskenar ucgen");
           }
            else
            {
                System.out.println("Eskenar Ucgen degildir");
            }
          }
        else
        {
            System.out.println("kenar uzunlukları sıfırdan büyük olmalıdır lütfen geçerli bir değer giriniz");
        }

scan.close();
    }

}
