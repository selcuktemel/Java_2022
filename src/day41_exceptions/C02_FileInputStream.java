package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args){
        /*
        bir code yazilirken olasi exceptionlar ön gorülüp exception olustugunda Java'nin ne yapmasını istedigimiz
        belirtilmelidir..
        eger exception olustugunda coden calismaya devam etmesini isteiyorsak method ismini yanina olusabilecek exceptionu deklare edebiliri.
        eger exception olussa da kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try catcj blogunun icine alir try bloguna sorun
        cıkabilecek exceptionu ve olası exception durumunda Jvanin ne yapmasini istediğimizi yazabiliriz.

         */


        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        System.out.println("Dosya Yolu = " + dosyaYolu);


    }
}
