package day30_passByValue;

public class StaticBlock {
    public static int age;
    static{
        System.out.println("Static block 2 calıstı");
        age =24;
    }
    static{
        System.out.println("Static block 1 calıstı");
        age =23;
    }

}
