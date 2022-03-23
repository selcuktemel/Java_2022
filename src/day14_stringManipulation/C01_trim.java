package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        //trim ucundan kesmek demek bir srtinde basta yada sonda bosluk " " varsa boslukları temizler.

        String str =" Java ogrenmek cok guzel   ";
        System.out.println(str);                 // |  Java ogrenmek cok guzel  |
        System.out.println(str.length());        //28
        System.out.println(str.trim());          // |Java ogrenmek cok guzel|
        System.out.println(str.trim().length());//23
        // tüm bosluklardan kurtulmak için atana yapmamız gerek
        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());//23

        str="ali okula git\ngit ali git";
        System.out.println(str.trim());
    }
}
