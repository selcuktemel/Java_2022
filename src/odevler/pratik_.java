package odevler;

public class pratik_ {
    public static void main(String[] args) {
        // 1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise super
        // az ise "100 den az sonuc bulundu" yazdırın


        String str="1-48 of 75 results for \"nutella\"";
        // sonuc sayisi 104 ilk önce 104 oradan alıp String olarak dısarıya alacagız
        //daha sonra aldıgımız string ifadeyi int e dönüstürecegiz

        int ilkBosluk=str.indexOf(" ");// burada ilk boslugu bulduk "of" u bulup da yapabilridik "1-48 " 4
        System.out.println(ilkBosluk); //4
        int ikinciBosuk=str.indexOf(" ",ilkBosluk+1);// ikinci boslugun indexdegerini bulduk "1-48 of " 7
        System.out.println(ikinciBosuk);//7
        int ucuncuBosluk=str.indexOf(" ",ikinciBosuk+1);// ücüncü boslugun index degerini bulduk "1-48 of 104 "11
        System.out.println(ucuncuBosluk);//11

        // burada arana degeri yani 104 ü substring methodu ile bulacagız
        String arananDeger= str.substring(ikinciBosuk+1,ucuncuBosluk);
        //ikinciBosuk+1 i neden yazıyoruz. neden ikinciBoslukdan itibaren aratmıyoruz? cunkü ikinciBosluk yazdıgımızda
        //substring methodu ilk degeri inclusive yani dahil oldugu için önünde bulunan bosluguda alır. boslugu alamk istemiyoruz
        // bundan doldayı bir sonraki karakterden itibaren alması için ikincBosluk+1 yazıyoruz.
        System.out.println(arananDeger);//104 ü string olarak bulduk.
        int arananDegerInt=Integer.valueOf(arananDeger);
        System.out.println(arananDegerInt);// Ü int olarak bulduk.

        if (arananDegerInt>100){
            System.out.println("super");
        }
        else {
            System.out.println("100 den az sonuc bulundu");
        }

    }
}
