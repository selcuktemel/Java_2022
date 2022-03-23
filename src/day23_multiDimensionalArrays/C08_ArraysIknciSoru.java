package day23_multiDimensionalArrays;

public class C08_ArraysIknciSoru {
    public static void main(String[] args) {
        // Asagıdaki multi Dimensional arays'ın ic array'lerindeki son eleamnların carpimini ekrana yazdiran bir program yaziniz {{1,2,3},{4,5},{6}}


        int arr [][]={{1,2,3},{4,5},{6}};

        int carpim=1;

        for (int i = 0; i < arr.length; i++){

            carpim*=arr[i][arr[i].length-1];
        }
        System.out.println("son elementlerin çarpimi : "+ carpim);
    }
}
