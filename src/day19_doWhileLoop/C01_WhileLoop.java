package day19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
//Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        Scanner scanner =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scanner.nextInt();

        //for loop ile de yapabiliriz ama biz while loop ile yapalim

        int bolen=1;
        int sayac=0;

        while(bolen<=sayi){

            if (sayi%bolen == 0) {//kullanıcının girdigi sayi bölen e tam bölünüyor
                System.out.print(bolen+ " ");
                sayac++;
            }
            bolen++;

        }
        System.out.println("");
        System.out.println(sayi+" sayisini bölen "+sayac+" adet sayi vardir");



    }
}
