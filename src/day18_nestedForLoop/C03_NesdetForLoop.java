package day18_nestedForLoop;

public class C03_NesdetForLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
           *
           * *
           * * *
           * * * *
         */

        int inputt = 5;



        for (int i = 1; i <= inputt; i++) {

            for (int j = 1; j <= i; j++) {
                //nested for loop kare//dikdörkten veya ucgen formatında olabilir
                //dikdörtgen istediğimizde iki loop için de bagımsız point belirleriz
                // ucgen  sekli vermek icin inner loop un end point'ini olarak outer degişken baglı yaparız

                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
