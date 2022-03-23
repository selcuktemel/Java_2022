package odevler.odev_03;

import java.util.Scanner;

public class O09_SayiT_C_Cr_B_ {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        // a.  sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //b. sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // c. sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //d. sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1, sayi2;
        sayi1 = scan.nextInt();
        sayi2 =scan.nextInt();
        // a.  sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        if (sayi1 >0 && sayi2>0) {
            System.out.println(sayi1+sayi2);
        }
        //b. sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        else if (sayi1 <0&&sayi2<0) {
            System.out.println(sayi1*sayi2);
        }
        // c. sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        else if (sayi1*sayi2<0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

        //d. sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
        }
        else if (sayi1 ==0||sayi2==0) {
            System.out.println("sifir carpmaya göre yutan elemandır");
        }
        else {
            System.out.println("lütfen geçerli bir sayı giriniz");

        }
scan.close();
    }
}
