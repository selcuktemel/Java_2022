package day18_nestedForLoop.whileLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayi alıp  bu sayıları ve aralarındaki tüm sayıları yazdıran bir kod yazın.

        int baslangic=40;
        int bitis=60;
        for (int i =baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //aynı soruyu while loopla yapınız
        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.print (baslangic);//61
    }
}
