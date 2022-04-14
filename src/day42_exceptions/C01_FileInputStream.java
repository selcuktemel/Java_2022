package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args)  {
/*
        bu güne kadar altı kırmızı ciziyosa CTE diyorduk burada Exception uyarısı veriyor.
        Altı kırmızı cizili her kod CTE degildir. Java syntaz hatalarını derleme esnasında compile farkeder ve altını cizer
        biz bunu güne kadar tamanına CTE diyorduk ancak exception konusu ile birlikte
        Compile Time Exception KAVRAMİ HAYATİMİZA GİRDİ.
         */
        // BUNA İKİ TÜRLÜ TEPKİ VEREBİLİRİZ
           /*
           1 .  TAMAM BEN OLAYIN FARKINDAYIM throws Exception yazarak exception fırlatabilrisin ama ben bunun farkındayım diyerbilridirk.
           2. FileInputStream üzerine gelerek try {} catch blogunun içine alabiliyorduk.
            */
        String dosyaYolu="src/day411_exceptions/dosya";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k=fis.read())!=-1) {// dosyayı okumak icin kalıp
                System.out.print((char) k);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        } catch (IOException e) {

            e.printStackTrace();
            System.out.println(" ko " +e);

        }
        /*
        Exceptionlar için de parent child iliskisi mevcuttur Eger bit kod icin birden fazla exception olusma ihtimali varsa oncelikle olasi exceptionlar
        parent child iliskisi tasiyor mu bakmamız gerekir.
        Eger parent child iliskisi yoksa istediğimiz sırada catch cümleleri olusturabiliriz.
        Eger Parent child iliskisi varsa sadece parent exception'i yazabiliriz veya şkşsşnş de yazmak istersek child'i once parent'i sonra yazmaliyiz

         */


    }
}
