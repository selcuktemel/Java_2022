package day33_vararg_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Prize dikkat");
//insetr: araya yerlestirme. içine koymak.
        System.out.println(sb1.insert(12," edin."));
String str="Hayatta cok guzel seyler var";
// bu strinden bir parcayi alıp sb1 eklemek istersem.
        System.out.println(sb1.insert(0,str,0,8));//Hayatta Prize dikkat edin.

        System.out.println(sb1.reverse());// tersten yazdirma
        //.nide takkid ezirP attayaH

        System.out.println(sb1.reverse());//Hayatta Prize dikkat edin.

        System.out.println(sb1.substring(3, 5));/*at*/
        System.out.println(sb1);//Hayatta Prize dikkat edin.(degismedi cunki substring methodu Stringden GELDİGİ icin degisme olmadi
        System.out.println(sb1.subSequence(3,5));/*at*/
        System.out.println(sb1);//Hayatta Prize dikkat edin.

    }
}
