import java.util.Scanner;

public class Selcuk {

    int yas = 35;
    int boy = 176;
    int kilo = 75;
    String gozRengi = "Ela";
    String babaAdi = "Mustafa";
    boolean evliMi = true;

    public void cocukSayisi() {
        if (evliMi == true) {
            System.out.println("lütfen cocuk sayisini giriniz");
            Scanner scan = new Scanner(System.in);
            int cocukSayisi = scan.nextInt();
            if (cocukSayisi > 0) {
                System.out.print(" GOOD");
            } else {
                System.out.print (" hayirlisi");
            }
        } else {
            System.out.print(" bekarlik sultanlıktır.");
        }
    }


    @Override
    public String toString() {
        return
                "yas=" + yas +
                        ", boy=" + boy +
                        ", kilo=" + kilo +
                        ", gozRengi='" + gozRengi + '\'' +
                        ", babaAdi='" + babaAdi + '\'' +
                        ", evliMi=" + evliMi;

    }


//  public Selcuk() {
//      System.out.println("parametresiz constructor çalisti ");
//  }
//
//  public Selcuk(String renk) {
//      System.out.println("Selcuk " + renk + " renkli bir saca sahiptir");
//  }
//
//  public Selcuk(int yas) {
//      System.out.println("Selcuk " + yas + " yasındadır");
//  }
//
//  public Selcuk(int yas, String renk) {
//
//  }
}
