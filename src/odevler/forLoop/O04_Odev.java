package odevler.forLoop;

import java.util.Scanner;

public class O04_Odev {
    public static void main(String[] args) {
        /*Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
toplayip, sonucu yazdiran bir program yaziniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam = 0;
        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            System.out.println(toplam);
        }else if(sayi1>sayi2){
            for (int i = sayi2; i <=sayi1; i++) {
                toplam +=i;
            }
            System.out.println(toplam);

        }else{
            System.out.println( "sayi1 + "+" sayi2 : "+ (sayi1+sayi2)+ " girilen sayılar esittir");
        }

    }

}
