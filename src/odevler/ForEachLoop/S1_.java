package odevler.ForEachLoop;

public class S1_ {
    public static void main(String[] args) {
        /*
        Soru 1:
Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
kullanarak bulunuz. Sonucu ekrana yazdiriniz.
 */

        int array[] = {1, 2, 3};
        int carpım = 1;

        for (int arr :
                array) {
            carpım *= arr;
        }
        System.out.println(carpım);
    }//main


}

