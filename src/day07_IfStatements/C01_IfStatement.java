package day07_IfStatements;

public class C01_IfStatement {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a>b) {
            System.out.println(a+b);// koşul sağlanmadığı için çalışmaz
        }

        if (a==b) {
            System.out.println(a*b);// koşul sağlanmadığı için çalışmaz
        }
        if (a>1) {
            System.out.println(a+b);// koşul sağlandığı için çalışır
        }

        if (a!=b) {
            System.out.println(a*b);// koşul sağlandığı için çalışır
        }
        // bağımsız if cümleleri kendileri dışındaki kodlarla ilgilenmezler
        //bir sart ve  sarta baglı sonuca odaklanır
        //birden fazla bağımsız if cümlesi oldugunda hepsinin bady calısabilecegi gibi
        //hicbirisinin body'si calımaydabilir.
    }
}
