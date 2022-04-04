package day31_mutableImmutableClasses;

public class C02_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {// bunu kabul etmedi cünkü biz a ı degistire degistire gittik.
                            //
            System.out.println("==");
        }
        if (a.equals ("2cfalse")){
            System.out.println("equalas");
        }
        String b="2cfalse";
        if (b == "2cfalse") {// bunu kabul etti cünkü biz ilk hali ile aldık.
            //
            System.out.println("==");
        }
        if (b.equals ("2cfalse")){
            System.out.println("equalas");
        }

    }
}
