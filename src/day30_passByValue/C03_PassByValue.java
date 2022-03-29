package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Java Pass By Value bir programlama dilidir.
        Yani ; bir primitive variable'i argument olarak methoda yollarsaniz Java o variable'i degil degerini(value ) method'a aktarir (pass)
         */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);//metohodu birincikez yazdirdi
        yuzdeOnIndirimYap(etiketFiyati);// methodu ikinci kez yazdirdi. ayni yeyi yazdirdi atama yapmamaıza ragmen
        System.out.println("iki indirimden sonra main method'da etiket fiyati : "+etiketFiyati); //etiket fiyati degismedi.

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {// burada etiket fiyati diye olusturgum sey yukarida olusturdugum variabledan daha farkli bir sey;
                                                               // eger class levelde variable olusturursak
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indrimli fiyatimiz : "+ etiketFiyati);

        /*
        pass by value: ben orjinal etiketFiyatını yazıp methoda yolladım oraya gittiginde de adi etiket fiyati ama omethoda götürdügü value deger
        etiket fiyatını variable olarak değil deger(value) olarak gidiyor. methoddaki variablenin isminin degişmesi herhangi bir seyi degistirmez.
        kısaca methoda gönderdiğimiz degerdir. main methoddaki variablenin degeri degismez.
         */
    }
}
