package day34_deneme;

import day34_accessModifier_Encapsulation.C01;

public class DenemeChild extends C01 {
    // bir class ı baska classın cocugu yapmak istiyorsaniz clas adının yanina.extends yazariz
    public static void main(String[] args) {
        System.out.println(halkaAcikSayi);
        halkaAcikSayi=30;
       C01 obj=new DenemeChild();
    }
}
