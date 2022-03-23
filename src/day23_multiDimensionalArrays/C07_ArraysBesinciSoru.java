package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_ArraysBesinciSoru {
    public static void main(String[] args) {

        // soru 5 kullanıcıdan bir cümle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle =scanner.nextLine();
        // scapeler, sayabilir yada split yapabiliriz

        String arr[]=cumle.split(" ");
        System.out.println("cümledeki kelime sayisi : "+ arr.length);


    }
}
