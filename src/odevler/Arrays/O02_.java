package odevler.Arrays;

public class O02_ {
    public static void main(String[] args) {
        /*

Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini

ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }


         */

        int array[][] = { {1,2,3}, {4,5}, {6} };
        int carpim=1;

        for (int i = 0; i < array.length; i++) {
            carpim*=array[i][array[i].length-1];


        }
        System.out.println(carpim);

    }
}
