package odevler.odev_02;

public class O01_AutoWidening {
    public static void main(String[] args) {
      //byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin
        byte sayi1=100;
        short sayi2=sayi1;
        int sayi3=sayi2;
        long sayi4=sayi3;
        float sayi5=sayi4;
        double sayi6=sayi5;
        System.out.println(sayi1+" "+ sayi2+" "+ sayi3+" "+ sayi4+" " +sayi5+" "+ sayi6);
    }
}
