package soruCozumleri_15_03_2022;

public class MyClass {

    int price = 20000;

    int year = 2020;

    String make = "Honda";

    public static void main(String[] args) {

        MyClass hondaAraba = new MyClass();

        System.out.println(hondaAraba.price);

        System.out.println(hondaAraba.year - 3);

        System.out.println(hondaAraba.make.replace("H", "K"));

    }

}


