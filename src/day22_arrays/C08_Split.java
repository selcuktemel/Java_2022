package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen bir cümlede istenen harfin kaç defa kullanıldıgını yazdiran bir method olusturun

        String cumle = "Nerede o hello world yazdiramayan ogrenciler";
        String harf = "e";
//char harf='e';
        harfKacKereKullnılmıs(cumle, harf);

    }


    private static void harfKacKereKullnılmıs(String cumle, String harf) {
// char ı stringe cevirme//Strign harfStr=""+harf;

        int sayac = 0;

        String karakterler[] = cumle.split("");
        System.out.println(Arrays.toString(karakterler));//[N, e, r, e, d, e,  , o,  , h, e, l, l, o,  , w, o, r, l, d,  , y, a, z, d, i, r, a, m, a, y, a, n,  , o, g, r, e, n, c, i, l, e, r]
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(" ")) {
                sayac++;
            }

        }
        System.out.println("Aradıgınız " + harf + "verilen cümlede  " + sayac + "  adet kullanilmistr");

    }// string le char ı karsılastıramazsınız.
}
