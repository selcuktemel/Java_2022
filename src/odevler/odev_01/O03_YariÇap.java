package odevler.odev_01;

import java.util.Scanner;

public class O03_YariÇap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yarıçap değerini giriniz");
        double yaricap =scan.nextDouble();

        System.out.println("(2*pi*yarıçap)cemberin çevresi : "+ (2*3.14*yaricap));
        System.out.println("(pi*yaricap*yaricap)dairenin alanı : "+(3.14*yaricap*yaricap));


    }
}
