package day05_matematikselislemler;

public class C02_PrePostIncrement2 {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi1+" ,"+sayi2+", "+sayi3);
        sayi3=++sayi1;

        System.out.println(sayi1+" ,"+sayi2+", "+sayi3);
        System.out.println(sayi3++);//12 önce 12 yazıracak ve sayi3=13; olacak daha sonra
        System.out.println(sayi3);//13 olacak
        System.out.println(--sayi2);//9  önce azalt sayi2=9  sonra sayi2'nin son değerini yazdır.

    }
}
