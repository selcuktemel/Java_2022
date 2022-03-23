package day18_nestedForLoop.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HomeWorkSayiBulmaca1 {
    public static void main(String[] args) {
        //bilgisayara 1-100 arasında bir sayi tutturun
        // kullanıcıdan bu sayıyı tahmin etmesini isteyin girilen her tahminde
        // sayiyi büyüt veya küçült diye kullanıcıya yok gösterin
        // kullanıcı sayiyi buldugunda kac tahiminde sayıyı buldugunu kullanıcıya yazdırın

        Random r = new Random(); //random sınıfı
        int a = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int i = 0;

        while (!(sayi == a)) {
            i++;
            System.out.print("Lutfen tahmininizi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi < a) {
                System.out.println("Lutfen sayiyi buyultunuz");
            } else if (sayi > a) {
                System.out.println("Lutfen sayiyi kucultunuz");
            } else {
                System.out.println(":-) Bravo " + i + ". tahminde dogru tahmin ettiniz :-) ");
            }


        }
    }
}