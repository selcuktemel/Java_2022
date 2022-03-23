package odevler.forLoop_;

public class ForLoop93 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
asagidaki sekli cizdirin
*
* *
* * *
* * * *
         */

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
