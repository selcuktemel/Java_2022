package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarındaki harfleri yazdıran bir kod yazınız

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+" ");

        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;
// baslangıc ve bitis sayıları arasında artis miktari ile olusacak tüm sayilari yazdirin.
        for (double i = baslangic; i < bitis; i++) {
            System.out.println(i+ " ");


        }



    }
}
