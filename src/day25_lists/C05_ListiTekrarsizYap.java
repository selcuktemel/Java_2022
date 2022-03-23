package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // örnek  {1, 3, 5, 3, 5, 6, 1, 7}; bu listeyi
        // yeniList:[ 1 3 5 7] bu hale dönüstürün

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar = tekrarsizListeOlustur(sayilar);

        System.out.println(sayilar);

    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsızList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsızList.contains(sayilar.get(i))) {//tekrarsizListe sayıların indeksini içermiyosrsa
                tekrarsızList.add(sayilar.get(i));
            }
        }
        return tekrarsızList;
    }
}
