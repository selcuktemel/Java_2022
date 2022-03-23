package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation2 {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime üç harften kısa ise "kelime cok kısa" yazdırın
        //eger kelime 3,4veya 5 harfli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        // eger 5 harften uzunsa "kelime cok uzun "yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String str=scanner.next();

       String tersKelime="";

        if (str.length()<3) {
            System.out.println("kelime cok kısa" );

        }else if (str.length()<=5) {
            if (str.length()==3){
                tersKelime=str.substring(2)+str.substring(1,2)+str.substring(0,1);

            }else if (str.length()==4){
                tersKelime=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

            }else {
                tersKelime=str.substring(4)+str.substring(3,4)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
            }
            System.out.println("girdiginiz kelimelerdeki harf sayisi :"+ str.length());
            System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );



        }else{
            System.out.println("kelime çok uzun");
        }


    }
}
