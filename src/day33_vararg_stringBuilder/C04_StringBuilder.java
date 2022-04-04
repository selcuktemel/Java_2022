package day33_vararg_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Yasasin Java");
        System.out.println(sb1.indexOf("Java"));//8
        System.out.println(sb1.lastIndexOf("s"));//4 sondan verdi
        System.out.println(sb1.indexOf("s"));//2 bastan  verdi

        System.out.println(sb1.replace(0,7,"Ne guzel"));//Ne guzel Java

        System.out.println(sb1);//Ne guzel Java
        /*mutable oldugu icin yaptıgımız degisiklik kalici olarak degisir.*/

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA
        /* toString methodu bize stringde bulunan methodları kullanmamız saglar ve stringe çevirmek icin kullanılan yontemdir
        burda yazdirirsak bir onceki halini yazdirir. YANİ*///Ne guzel java yazdirir.
        System.out.println(sb1);//Ne guzel Java

        System.out.println(sb1.delete(0,3));//guzel Java 0'ıncı indexden baslar ve 3 üncü indexe kadar gider 3 üncü indez dahil degildir.

        System.out.println(sb1.deleteCharAt(5));// hangi karakteri silmek istiyorsak o karaketerin indexini yaziyoruz.



    }
}
