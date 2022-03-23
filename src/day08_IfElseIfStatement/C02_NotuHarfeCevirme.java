package day08_IfElseIfStatement;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        //50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not=scan.nextDouble();
        if (not<0||not>100) {// en önemli şartı en basa koymak lazım önce yukarıdan ağaıya çalışacağı için ilk bulduğu true yi çalıştırır.
            System.out.println("lütfen geçerli bir not giriniz");
        }
        else if (not <50) {
            System.out.println("notunuz DD");
        }
        else if (not<60) {
            System.out.println("notunuz CC");
        }
        else if (not<80){
            System.out.println("notunuz BB");
        }
        else {
            System.out.println("notunuz AA");
        }// else bittiğinde durulardan sadece bir tanesi çalışır.
        // o zman ben durumları eleyerek gidebilirim.



    }
}
