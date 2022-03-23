package odevler.odev_01;

import java.util.Scanner;

public class O04_DikdortgenPrizma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdötgenler prizmasının uzun, kısa kenarlarını ve yüksekliğini giriniz");
        double kısa, uzun,yükseklik ;
        yükseklik=scan.nextDouble();
        uzun=scan.nextDouble();
        kısa=scan.nextDouble();

        System.out.println("dikdörtgenler prizmasının hacmi : "+ (kısa*uzun*yükseklik));
    }
}
