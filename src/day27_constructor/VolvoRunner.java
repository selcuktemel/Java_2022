package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo araba1 = new Volvo();
        System.out.println(araba1.marka);//Volvo
        araba1.yakit="Dizel";
        araba1.elektrliMi=false;
        System.out.println(araba1.maxHiz);

        System.out.println(araba1.toString());//Model : null, Yakit : Dizel, Max hiz : 240

        Volvo araba2=new Volvo();

        araba2.yakit="Elektirkli";
        araba2.elektrliMi=true;
        araba2.model="XC40";
        System.out.println(araba2.toString());//Model : XC40, Yakit : Elektirkli, Max hiz : 160
    }
}