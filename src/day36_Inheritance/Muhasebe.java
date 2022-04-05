package day36_Inheritance;

public class Muhasebe extends Personel{
    protected int saatUcreti;
    protected String statu;
    protected int maas=8;

    protected int maasHesala(){
        int maas = saatUcreti*8*30;

        return maas;

    }

}
