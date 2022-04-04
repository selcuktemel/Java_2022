package day33_vararg_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // Kac tane string verilirse verilsin içlerinden en uzun olanı yazdiran bir method olusturun.
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4="Karadenizliler";

        // yazilan argüment sayisi sabitse herzamanki gibi bir method olusturabiliriz.
        // ancak argüment sayisinin degisme ihtimali varsa o zaman varargs tercih edilir.
        enUzunKelime(str1, str2, str3,str4);// yeni eleman eklemek istediğimizde sadece buraya eklememiz yeterli
        // işlemler for each loop icerisinde yapılcagından ve varargs kullanıldıgından yeni elemani sadace methodun parametresine eklememiz yeterli

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr = "";

        for (String each : str// her birini tek tek alıp gerirecek

        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }

        }

        System.out.println(enUzunStr);
    }
}
