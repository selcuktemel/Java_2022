package odevler.ForEachLoop;

public class S4_ {
    public static void main(String[] args) {
/* Soru 4: Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
yazdiriniz. ipucu: split() */


        String str = "bir string olusturunuz";
        String arr[] = str.split("");

        for (String each1:arr){
            System.out.print(each1);

        }

    }
}

