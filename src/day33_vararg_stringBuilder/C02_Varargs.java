package day33_vararg_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        // paremetre olarak br int ve istediğimiz kadar string alan en uzun kelimeienin harf saiyi ile
        //int parametre carpıp sonucu yazdiran bir method olusutun
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Karadenizliler";
        String str5 = "Malatyalilarinok";
        int sayi = 5;

        enUzunlaCarpim(sayi, str1, str2, str3, str4, str5);
    }

    private static void enUzunlaCarpim(int sayi, String... str) {// eger bir methodda varargs dan baska bir parametre kullanacaksak önde diger parametreleri yazip
        //  varargs'ı sonra yazmaliyiz.
        // bir methodda birden fazla varargs kullanilmaz. cünkü varargs nerede duracagını bilemez.
        String enUzunKelime = "";
        for (String each : str) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println(enUzunKelime);
        System.out.println("istenen deger : " + enUzunKelime.length() * sayi);
    }
}
