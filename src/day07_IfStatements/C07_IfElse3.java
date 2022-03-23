package day07_IfStatements;

import java.util.Scanner;

public class C07_IfElse3 {
    public static void main(String[] args) {
        //Kullanıcıdan yasını isteyin 65  veya daha büyükse emekli olabilirsin 65 den küçükse emekli olamazsın yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas >=65) {
            System.out.println("emekli olabilirsiniz");
        }
        else{
            System.out.println(65-yas+ " sene daha calismalisin");
        }
        //if else statementlarda iki durumdan sadece ve sadece biri çalışır.
        //ikisinin birden çalışma ihtimali yok
        //iksiinin de çalımama ihtimali yok
    }
}
