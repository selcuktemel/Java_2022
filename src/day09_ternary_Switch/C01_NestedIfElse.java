package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
//Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// a. Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
// b. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
// c. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
// d. Girdiği rakam 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dort basamakli pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        //4532
        if (sayi<1000||sayi>9999) {// burada istenmeyen durumu yazıyoruz
            System.out.println("lütfen 4 basamaklı sayı giriniz");

        }else if (sayi%5==0) {// 4 basamaklı ve sayi 5 e tam bölünüyor

            if (sayi %10==0) {// dort bsamaklı 5 ile bölünebilen ve son rakamı 0 olan
                System.out.println("5'e bölünebilen çift sayi");

            }else  {// dort basamaklı 5'ile bölüneblen ve son rakamı 0 olmayan
                System.out.println("5 ile bölünebilen tek sayi");
            }

        }else {// dort basamaklı ve 5'e bölünebiliyor
            System.out.println("tekrar deneyin");

        }

    }
}
