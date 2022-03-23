package odevler.odev_02;

public class O03_IntBolme {
    public static void main(String[] args) {
        int sayi=1450;
        int sa =5;
        System.out.println("sayi2 = "+ (sa=sayi/sa));
        System.out.println(sa);

        byte sayi1=100;
        short sayi2=sayi1;
        int sayi3=sayi2;
        long sayi4=sayi3;
        float sayi5=sayi4;
        double sayi6=sayi5;

        System.out.println("sayi2+sayi1: " +(sayi2+sayi1));
        System.out.println("sayi2-sayi4: " +(sayi2-sayi4));
        System.out.println("sayi4*sayi5: "+ sayi4*sayi5);
        System.out.println("sayi5/sayi6: "+ sayi5/sayi6);
        System.out.println("sayi2*sayi3: "+ sayi2*sayi3);
        System.out.println("sayi1/sayi6: "+sayi1/sayi6);

    }
}
