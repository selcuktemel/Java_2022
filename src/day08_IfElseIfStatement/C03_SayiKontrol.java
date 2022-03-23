package day08_IfElseIfStatement;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
//Soru 6) Kullanicidan iki sayi isteyin,
        // a.  sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //b. sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // c. sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //d. sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double sayi1, sayi2;
        sayi1 = scan.nextDouble();
        sayi2 =scan.nextDouble();
        // a.  sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        if (sayi1 >0 && sayi2>0) {
            System.out.println("pozitif sayıların toplamı : "+ (sayi1+sayi2));
        }
        //b. sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        else if (sayi1 <0&&sayi2<0) {
            System.out.println("negatif sayıların çarpımı : "+sayi1*sayi2);
        }
        // c. sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        else if (sayi1*sayi2<0) {// kafayi kullan
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }
        //d. sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
        else  {System.out.println("sifir carpmaya göre yutan elemandır");
        }

    }
}
