package odevler;

public class pratik_2 {
    public static void main(String[] args) {
        // 1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise super
        // az ise "100 den az sonuc bulundu" yazdırın


        String str="1-48 of 75 results for \"nutella\"";

       int of=str.indexOf("of");
        System.out.println(of);//
       int ilkBosluk=str.indexOf(" ", of);
        System.out.println(ilkBosluk);
        int ikinciBosluk=str.indexOf(" ", ilkBosluk+1);
        System.out.println(ikinciBosluk);

        String arananDger=str.substring(ilkBosluk+1,ikinciBosluk);
        System.out.println(arananDger);
        int arananDegerInt=Integer.parseInt(arananDger);
        System.out.println(arananDger);

        if (arananDegerInt>100){
            System.out.println("super");
        }else {
            System.out.println("100 den az deger bulundu");
        }



    }
}
