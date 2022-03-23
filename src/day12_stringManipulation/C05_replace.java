package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str ="Bugun ne cok sey ogrendik";

        // bu cumlede bosluk dısındaki karakter sayısını bulunuz
        // eger ben str üzerinde direkt işlem yaparsam str degisir. asıl cumleyi degistirmeden yazdırmak istiyorsan sout un içinde yazabiliriz.

        System.out.println(str.replace(" ","").length());//21  bunu yaptıgınızda atama yapmadıgımız icin orjinal string muhafaza edilmiş olur
        // kalıcı olarak değişmez sadece o satır için degişilkik yapılmıs olur yazdırılmıs olur.
        System.out.println("orjinal str karakter sayısı " +str.length()); //25
        System.out.println(str.length()-str.replace(" ","").length());//4


        // str da kalici degisiklik yapalim
        // bugun yerine Yarin
        // ogrendik yerine onrenecegiz
        str =str.replace("Bugun","Yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra: "+ str);//Yarin ne cok sey ogrenecegiz
        System.out.println(str.length());//28
        System.out.println(str.replaceAll("ne cok", "ne az"));


    }
}
