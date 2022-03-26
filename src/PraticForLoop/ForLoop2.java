package PraticForLoop;

public class ForLoop2 {
    public static void main(String[] args) {
        /*
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15
         */
        //birinci cozum
        int sayi = 5;



        for (int i = 1; i <= sayi; i++) {
            int a = 0, b = sayi - 1;
           for (int j = 1; j <= i; j++) {

                int sekil = i + a;


                System.out.print(sekil + " ");

                a+= b;

                b--;
            }
            System.out.println();
        }
// ikinci cozum

        for (int i = 1; i <= sayi; i++) {


            int sekil2 = i;



            for (int j = 1; j <= i; j++) {




                System.out.print(sekil2 + " ");



                sekil2 += sayi - j;




            }
            System.out.println("");
        }
    }
}