package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDegistirme {
    public static void main(String[] args) {
        // verilen bir lstede istenen iki indexdeki elementlerin yerini kalıcı olarak degiştiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int IlkIndex = 2;
        int IkinciIndex = 5;
        sayilar = swapElements(sayilar, IlkIndex, IkinciIndex);


    }

    private static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //1 bir temp sayi olusturup verilen indexlerdei sayilari yer degitirin
        // indexleri kontrol edip sinirin otesinde verildiyse uyari mesajı yazdirin.







        return sayilar;
    }
}
