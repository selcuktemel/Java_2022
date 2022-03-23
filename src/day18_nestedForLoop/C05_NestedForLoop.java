package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.  65=A'nın ascıı değeri
       */
        char input =90;

        for (char i = 65; i <= input; i++) {
            for (char j = 65; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

}
