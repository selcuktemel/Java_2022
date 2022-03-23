package odevler.forLoop_;

public class Forloop4 {
    public static void main(String[] args) {
        // verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazdırın

        char harf1='a';
        char harf2='m';

        for (char i =harf1 ; i <=harf2 ; i++) {
            System.out.print(i+ " ");
        }

        // baslangıc ve bitis sayilari arasında artis miktari ile olusaack tüm sayilari yazdirin
        double baslangıc=10;
        double bitis=20;
        double artis=0.5;

        for (double i = baslangıc; i <=bitis;i+=artis) {
            System.out.println(i+" ");

        }







    }
}
