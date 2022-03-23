package odevler.odev_02;

public class O02_EcplicitNarrowing {
    public static void main(String[] args) {
      //  int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int a =685455;
        short b=(short) a;
        byte c =(byte)b;
        System.out.println(a+" "+b+" "+c);
       //Float data turunde bir variable olusturun ve yazdirin
        float kaan=2544.44f;
        System.out.println(kaan);
        //double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin
        double sayi=255.36;
        int sayi2=(int)sayi;
        byte sayi3=(byte)sayi2;
        System.out.println(sayi+" "+sayi2+ " "+sayi3 );
//  int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int ay =222;
        double ayy=2.3;
        System.out.println("int/double   : " +ay/ayy);

    }
}
