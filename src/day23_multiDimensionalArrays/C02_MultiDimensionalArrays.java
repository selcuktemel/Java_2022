package day23_multiDimensionalArrays;

public class C02_MultiDimensionalArrays {
    public static void main(String[] args) {
// verilen multi dimansional Array in elementlerinin toplamını bulunuz
        int arr[][] = {{3, 1, 7}, {6, 10, 2}};
        //eleman sayisi kactır

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("arraydeki elementlerin toplamı"+toplam);

        // arr[0][1] birinci elemana ulasmak için böyle yaparız.



    }
}
