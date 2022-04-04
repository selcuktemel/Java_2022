package day34_deneme;

import day34_accessModifier_Encapsulation.C01;

public class Deneme {
    public static void main(String[] args) {
        //  C01 obje1 =new C01();
        // C01() constroctoru defaul accesModifier'e sahip oldugundan baska package'den kullanilamaz

        C01.halkaAcikSayi = 13;
        //olusturulan variable hpublic oldugu için baska package'den ulasabildik.
        // aaynı zamanda statik oldugu icin C01 class adi ile cagirdir.
        //instance variable olsaydi obje ile cagıracaktiık.
    }
}
