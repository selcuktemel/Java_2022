package day27_constructor;

public class Volvo {
    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektrliMi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu();
    int maxHiz = maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model = mdl;
        elektrliMi = elk;
        yil = yl;
        yakit = ykt;
        otomatikPilot = otomatikPilotSorgusu();
        maxHiz = maxHizAta();
    }

    public Volvo() {

    }

    public int maxHizAta() {
        int max = 0;
        if (elektrliMi) {
            max = 160;
        } else {
            max = 240;
        }
        return max;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc = false;
        if (elektrliMi) {
            sonuc = true;
        }
        return sonuc;
    }

    public String toString() {// methodun adını toString koyarsanız direkt yazdirabilirisnz.
        String arabaOzellikleri = "Model : " + model + ", Yakit : " + yakit +
                ", Max hiz : " + maxHizAta();


        return arabaOzellikleri;
    }


}

