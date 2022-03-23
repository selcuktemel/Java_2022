package odevler.forLoop_;

public class ForLoop2 {
    public static void main(String[] args) {
        //10 İLE 30 Arasındaki sayiları aralarında virgül olarak yazdirin

        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+",");

        }
        System.out.println(30);

        int baslangıc=10;
                int bitis=30;

        for (int i = baslangıc; i <=bitis ; i++) {
            if (i<bitis){// i bitişten yani 30'dan küçükse böyle yazdır. yani 1,2,3,4,...29, sonra 30 yazdık ve artık if koşulu devreden çıktı
                System.out.println(i+", ");
            }else { // i bitişten küçük oldugu sürece yukarıdaki yazıldı sonra 30 oldu if kosulu bitti elsede diger kosulu
                   // yani büyük olma koşulu devreye girdi 30 yazdırdı ve durdu. çünkü bitiş=30.
                System.out.println(i);
            }

        }

    }
}
