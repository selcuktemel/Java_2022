package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));//ile IT cok guzel

        //Yukarıdaki String'i kullancark mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));
        System.out.println(str.substring(9));// yazilan index inclusive(dahil demek)

        // eger bir indexden sona kadar olan parcayı degil belirli bir parcayı almak istersek
        // iki parametre yazmak gerekiyor str.substring(baslangıcIndeksi,bitisIndeksi)
        // burada bilmem gereken sey baslangıc indeksi inclusive (dahildir)
        // bitis indeksi eclusive (dahil degildir)

        System.out.println(str.substring(0, 5));// "Java " Java bosluk

        System.out.println(str.substring(0, 1));// ilk harfi charAt ile bulabiliyorduk str.charAT(4)

        // bana 6. karakteri string olarak bulun
        // String harf =str.charAt(4);// char a cevirdiği için kabul etmez
        String harf = str.substring(5, 6);
        System.out.println(harf);

        //System.out.println(str.substring(5,2));// bitis indexi baslangıc indexinden büyük olamaz

        str = "Java gun gecdikce güzellesiyor";
        System.out.println(str.substring(str.length() - 1));// son harfi yazdırmak isteseydim lenght()-1 yazardım
        System.out.println(str.substring(7, 7));// hiclik döndürür.
        System.out.println(str.substring(str.length() - 5));//son bes harfi yazdiralim
        System.out.println(str.substring(str.length()));// son harften sonraki kısmı yani hiclik verir.
        System.out.println(str.substring(str.length() - 9));//son 9 harfi yazdiralim

    }
}
