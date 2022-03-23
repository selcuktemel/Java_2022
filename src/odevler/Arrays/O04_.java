package odevler.Arrays;

public class O04_ {
    public static void main(String[] args) {
        /*
        Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

         */

      int arr1  [][]=  { {1,2,3}, {4,5}, {6,7} };

      int yeniArr[]=new int[3];


      for (int i = 0; i < arr1.length; i++){
          for (int j = 0; j <arr1[i].length;i++){
              yeniArr[i]=i;
          }

      }





    }
}
