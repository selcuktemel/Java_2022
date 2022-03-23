package day04_dataCasting_Increment;

public class C06_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10);//30
        System.out.println(sayi); //20 eger atama yapmazsak sayıda yaptığımız artırma veya azaltma kalıcı olmaz
        sayi =sayi+10;// burada atama yaparak sayi variable'nın değerini 30 yaptık.
        System.out.println(sayi);
        System.out.println(sayi=sayi+=10);// burada hem atama yapıyorum hem değer atıyorum sayi =40 oldu
        System.out.println(sayi);//40
        System.out.println(sayi+=10);//50 oldu ve sayının değeri 50 oldu.
        System.out.println(sayi);//50

        // bir variablenin değerini kalıcı larak artırmak veya azaltmak istterseneniz assinment atama şarttr.

        System.out.println(sayi++);//50 önce yazdırı sonra atar daha sonraki yazdırma işleminde sayinin değerini bir artırı sayıya da atama yapmış olur
        System.out.println(sayi);//51
        System.out.println(++sayi);//52 önce atama yaparak sayının değerini artırı daha sonra sayıyı artırdığı şekilde yazdırır


    }
}
