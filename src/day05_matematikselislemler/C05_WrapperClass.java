package day05_matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        // primitive data türü ile non primiti arasındaki farklar nelerdi

        String str="Java";
        int sayi=10;
        System.out.println(str.toUpperCase());// Hepsini büyük harf ile yazdıracak JAVA
        System.out.println(str);// atama olmadığı için kendisi değişmdi yukarıdaki method ile yazdırdık.
        // non-Primitive data türleri data depolamak yanında bir çok faydal methoda sahiptir.
        // ancak primitive data türlerinin böyle bir özelliği yoktur. Primitive data türleri sadece değerleri saklar.

        //primitive data türleri için de bazi methodlar gerekli olduğunda jAVA ara bir çözüm üretmiştir.
        // jAVA her bir primitive data türünü non-primitive olarak kullanabilmek için özel classlar oluşturmuştur.
        // bunlara Wraper Class adini vermiştir.
        double sayi2=20.5;
        //sayi2 primitive olduğundan sayi1. dediğimizde hiçbir method gelmez

        Double sayi3=15.3;
        // sayi  Wrapper Class olan Double classını kullandığından sayi3. dediğimizde birçok method gelir.




    }
}
