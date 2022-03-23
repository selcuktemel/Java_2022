package odevler.StringManipulation;

import java.util.Scanner;

public class O05_lastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle alin
        // ve asagidaki uc durumdan uygun olani yazdirin
        // 1- cumle java icermiyor
        // 2- cumle 1 tane java iceriyor
        // 3- cumlede birden fazla java var

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.next().toLowerCase();

        // sayısal olarak bir degeri oldu artık. cumle içinde java varsa ilkJava>=0 veya sonJava>=0 dır.
        // cumle içinde java yoksa ilkJava<0 veya sonJava<0 yani ilkJava== (-1) veya sonJava==(-1) demektir.
        // peki birden fazla olduğnu yada sadece cümle içind birkez geçtiğini nasıl anlarız?
        // ilkJava==sonJava ise cümlede birkere geçmiştir. javanın bir defa geçtiğini, geçmediğini elmizde olan olan verilerle biliryoruz
        // birden çok geçtiğini de bu şartları sağlmadığında anlayabiliryoruz
        int ilkJava=cümle.indexOf("java");
        int sonJava=cümle.lastIndexOf("java");


    }
}
