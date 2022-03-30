package day27_constructor;

public class Z {

    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;

    // burasi çok önemli
    public Z(String isim, String soyisim, int numara, boolean gercekMi) {
       this.isim = isim;//isim = ism;
       this.soyisim = soyisim;//soyisim = soyism;
       this.numara = numara;//  numara = no;
       this.gercekMi = gercekMi;//gercekMi = grc;
 
    }

    public Z(String isim, String soyisim, int numara) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.numara = numara;
    }


    public String toString() {

        return ("isim : " + isim + " Soyisim : " + soyisim + " Numara : "
                + numara + " gercekMi : " + gercekMi);

    }

}
