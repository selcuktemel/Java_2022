package day04_dataCasting_Increment;

public class C01_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str =dogruMu;// sol String sag boolean olunca kabul etmiyor

        byte sayi1=44;
        System.out.println(sayi1);//44

        short sayi2=sayi1;
        System.out.println(sayi2);// eşitliğin solu short , sağı ise bir şey yazmasa bile byte olduğunu biliyoruz.
        // java itiraz etmiyor çünkü sayı1 byte sayı2 short olduğu için ikiside sayısal veri tuttuğu için ve
        // değer olarak atanan data türü variable data türü küçük olduğu için java sorun yapmaz
        //  // Auto Widening
        double sayi3=sayi2;

        System.out.println(sayi3);





    }
}
