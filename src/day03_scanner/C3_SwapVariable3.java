package day03_scanner;

public class C3_SwapVariable3 {
    public static void main(String[] args) {
        //2 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        //        ucuncu bir variable kullanmadan degistiren (SWAP)
        //        bir program yaziniz
        //         Orn    : sayi1=10 ve sayi2=20;
        //          kod calistiktan sonra
        //         sayi1=20 ve sayi2=10
        int sayi1=20;
        int sayi2=40;

        System.out.println("once sayi1: "+ sayi1+" sayi2 "+sayi2);
        sayi1=sayi1+sayi2;//sayı1 30
        sayi2=sayi1-sayi2;//sayı2 10
        sayi1=sayi1-sayi2;//sayi1 20

        System.out.println("sonra sayi1: "+ sayi1+" sayi2 "+sayi2);

    }
}
