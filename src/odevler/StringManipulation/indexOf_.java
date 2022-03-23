package odevler.StringManipulation;

import java.util.Scanner;

public class indexOf_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle= scan.nextLine();
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.nextLine();

        int ilkKullanım=cumle.indexOf(kelime);// içinde vardır veya yoktur. yoksa -1 döndürür, ve varsa index çıkar
        int ikinciKulllanım=cumle.indexOf(kelime,ilkKullanım+1);// ilk kullanım yoksa yani-1 olsa bile 1 le topladığım için 0 ıncı indexden baslayacaktır.
        // ilk önce aranan kelime sonra baslanngıc indexi girilecek.

        if (ilkKullanım == (-1)) {
            System.out.println("girilen kelime cumlede kullanılmamıştır");

        }else if(ikinciKulllanım==(-1)) {// ikinci kullanımı bulamadığı için ve ilk kullanım mevcut oldugu için kelime cümlede bir kere kullanılmıstır.
            System.out.println("ikinciKulllanım - 1 esit oldugundan "+ kelime+ " cümlede bir kere kullanılmıstır" );
        }
        else {
            System.out.println(kelime+" cümlede birden fazla kullanılmıstır");
        }


    }
}
