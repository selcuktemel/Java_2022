package day39_overriding;

public class Araba {
    protected String hareket = "Arabalar Teker ile hareket ederler";
    protected String hiz = "Arabalar motor gucune göre hiz yaparlar";
    protected String yakit = "Arabalar farkli yakitlar kullanavbilir";
    protected String marka = "Arabalar uretildigi markaya sahiptir";

    public void motor() {
        System.out.println("Arabalar fakrlı markalarda motor kullanırlar");
    }

    public void yakitTuketimi() {
        System.out.println("Arabalar motor gucu ve yakit turune göre yakit tuketirler");
    }
}
