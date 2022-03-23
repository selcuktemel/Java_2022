package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElemanlarıSilme {

    public static void main(String[] args) {


        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran bir method olusturun
        // örnek  {1, 3, 5, 3, 5, 6, 1, 7}; output :[ 1 3 5 7]

        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);

        tekrarsizListeOlustur(sayilar);

    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsızList=new ArrayList<>();

        for (int i = 0; i <sayilar.size(); i++) {
            if(!tekrarsızList.contains(sayilar.get(i))){//tekrarsizListe sayıların indeksini içermiyosrsa

                tekrarsızList.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsızList);
    }
}
