package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {

        /*
        Kullanıcıdan yasını isteyin kullanıcı yas olarak negatif bir sayii,0 veya 120'den buyuk bir sayi girerese
        IllegalArgumentException olusacak sekilde bir program yaziniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfan yasinizi giriniz");
        int yas=scanner.nextInt();
        if (yas<=0||yas>120){
            // Java bizim istediğimiz durumlarda exception fırlatabilirr
            throw new IllegalArgumentException();

        }else{
            System.out.println("yasınız dogru");
        }




    }
}
