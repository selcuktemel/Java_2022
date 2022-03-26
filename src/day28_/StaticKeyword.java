package day28_;

public class StaticKeyword {
    static  int sayi1;
    int sayi2;

    public static void main(String[] args) {
        /*
        Static variableler direkt classa baglidir
        Class içerisinde yapilan her türlü degisiklik statik variblarda kalici olr
        ınstance variableler ise objeye baglıdır
        ınstance variablara sadace obje uzerinden erisebilir
        ve bir obje uzerinden esisilere yapilan degisiklik instance variablelerin degerini tum objeler için
        kalici olarak degistiremez sadece o obje için instance variable degerini kalici olarak degistir.
         */

        System.out.println("sayi1 " + sayi1);//
        //System.out.println(" sayi1 " + sayi2); static olmadigi icin main methodun içinde kullanamyız
        StaticKeyword obj1=new StaticKeyword();
        System.out.println("sayi2 "+ obj1.sayi2);//0
        sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1 " + sayi1);//1
        System.out.println("sayi2 "+ obj1.sayi2);//1

        System.out.println(obj1.sayi1);// sayi1 e direkt ulasabileceğimiz için uyarı verir. yazdırmakta problem olmaz
        StaticKeyword obj2=new StaticKeyword();
        System.out.println("sayi2 " + obj2.sayi2);//0
        System.out.println("sayi1 "+ obj2.sayi1);//1

        obj2.sayi1++;//2
        obj2.sayi2++;//1
        System.out.println("sayi2 " + obj2.sayi2);//1
        System.out.println("sayi1 "+ obj2.sayi1);//2

        System.out.println("sayi2 " + obj1.sayi2);//1
        System.out.println("sayi1 "+ obj1.sayi1);//2
        obj1.sayi1 ++;
        obj1.sayi2++;
        System.out.println("sayi2 " + obj1.sayi2);//2
        System.out.println("sayi1 "+ obj1.sayi1);//3




    }
}
