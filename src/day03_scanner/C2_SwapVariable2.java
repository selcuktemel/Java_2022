package day03_scanner;

public class C2_SwapVariable2 {
    public static void main(String[] args) {
        //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        // Orn  : sayi1=10 ve sayi2=20;
        //  kod calistiktan sonra
        //  sayi1=20 ve sayi2=10
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan once sayi1: "+ sayi1+" sayi2 "+sayi2);

       // boş bir variable oluşturup sayı1 i ona otayalim "temp=geçici demek"
        int temp=sayi1;
        // 2 inci adım sayı1 e yeni değerini atayalım
        sayi1=sayi2;
        // 3'ÜNCÜ ADIM sayi2'ye tempe yedeklediğimiz sayi1 değerini atayalım
        sayi2=temp;

        System.out.println("Swap'dan sonra sayi1: "+ sayi1+" sayi2 "+sayi2);


    }
}
