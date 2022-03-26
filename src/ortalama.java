import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ortalama {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int toplam = 0;
        double ortalama = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        ortalama+=toplam/arr.length;
        System.out.println(ortalama);

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > ortalama) {
                sayilar.add(arr[i]);

            }
        }
        System.out.println(sayilar);

    }
}
