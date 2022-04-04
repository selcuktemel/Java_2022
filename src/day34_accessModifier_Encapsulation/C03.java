package day34_accessModifier_Encapsulation;

public class C03 {
    // encapsule edeceğmiz iki variable olsun
    private int sayi;
    private String str;

    public int getSayi() {// get getirir. get sayi dediğim zaman sayiyii getirir deger atamaz. görsun deger girip degistiremesin
        return sayi;
    }

    public void setSayi(int sayi) { //setSayi dediğimizde yazdırır.deger girebilir sonucu göremez
        this.sayi = sayi;
    }

    //get ve set birlestiginde public gibi oluyor
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "sayi= " + sayi +
                ", str= " + str;
    }
}
