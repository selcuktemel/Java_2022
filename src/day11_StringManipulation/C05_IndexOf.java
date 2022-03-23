package day11_StringManipulation;



public class C05_IndexOf {
    public static void main(String[] args) {


        String str1="Java bir baska guzel valla çok guzel";
//istersek char olarak verdiğimiz bir harfin indexini bize döndürür
        System.out.println(str1.indexOf('J'));//0

        //istersek bir harf ya da metin olarak verdiğimiz String indexini bize döndürür
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.indexOf("aska"));// 10 başlangıç indeksini verir ve 10 veriri "aska" a harfi 10 uncu harftir.

        System.out.println(str1.length()-1);//35
// aynı harften birden fazla varsa
        System.out.println(str1.indexOf("b"));//5 ilk bulduğu doğru eşleşmenin indexsini döndürür .soldan sağa dogru 5

        System.out.println(str1.indexOf('b', 5));//5
        //bu methodda java aramaya fromIndex olarak yazdigimi< index'den baslar
        // (inclusive)dahil

        // verilen Stringdeki 2'inci a harfini bulalım.
        int ilkIndex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkIndex+1));//3

        int ilkIndex1=str1.indexOf("b");//1
        System.out.println(str1.indexOf("b",ilkIndex1+1));//9
        // 20'inci indexden sonra guzel aratalım
        System.out.println(str1.indexOf("guzel", 20));// 31 inci indexde

        // metinde Stringde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));// indexOf methodu bana he zaman int döndürür. bana int ile olmayan karaktere yok demesi lazım return type'i index
        // yok demenin sayısal karşılığı olraak java -1 döndürmeyi tercih etmiştir.

    }
}
