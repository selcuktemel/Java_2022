package odevler.Arrays;

public class O01_ {
    public static void main(String[] args) {

/*
Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

 */
        int array[][] = {{1, 2, 3}, {4, 5, 6}};
        tumElemanlarınCarpiminiEkranaYazdir(array);
    }

    private static void tumElemanlarınCarpiminiEkranaYazdir(int[][] array) {
        int carpım = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                carpım *= array[i][j];
                //int array[][]
            }
        }
        System.out.println("tum elemanlarinin carpimini : " + carpım);
    }
}
