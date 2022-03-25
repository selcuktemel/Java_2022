package odevler.ForEachLoop;

public class S3_ {
    public static void main(String[] args) {
        /*Soru 3:iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
       */

        String arr1[] = {"Ali", "Ayse", "Can", "Fatma"};
        String arr2[] = {"Evren", "Emsal", "Emre","Fatma"};

        String ortakElemanlar = "";

        for (String each1 : arr1) {
            for (String each2 : arr2) {
                if (each2.equalsIgnoreCase(each1)) {
                    ortakElemanlar += each1;
                }
            }
        }
        if (ortakElemanlar.isEmpty()) {
            System.out.println("ortak Elemanlar listesi bostur");
        } else {
            System.out.println("ortak elemanlar : " + ortakElemanlar);
        }
    }
}
