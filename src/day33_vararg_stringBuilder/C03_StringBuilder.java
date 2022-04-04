package day33_vararg_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);
        System.out.println("sb1 lengt : "+sb1.length());// uzunlugu 0
        System.out.println("sb1 capscity : "+sb1.capacity());// capasitesi 16
        // ben bu sb1 in tamamını karakterle doldursam 16 karakter alır
        System.out.println("sb2 lengt : "+sb2.length());// uzunlugu 14
        System.out.println("sb2 capscity : "+sb2.capacity());// capasitesi 30 ((14*2)+2)

        System.out.println("sb3 lengt : "+sb3.length());// uzunlugu 0
        System.out.println("sb3 capscity : "+sb3.capacity());// capasitesi 10
        // içine birsey yazmadigimiz icin uzunlugu 0 içine 10 yazdigimiz icin capasitesi 10.

        /*bunlara ekleme yapmaka icin append methodu ile sb ye ekleme yapabiliriz*/

        sb1.append("Java").append(" ").append("cok").append(" ").append("güzel");
        System.out.println("sb1 lengt : "+sb1.length());// uzunlugu 14
        System.out.println("sb1 capscity : "+sb1.capacity());// capasitesi 16
        sb1.append(3);
        System.out.println("sb1 lengt : "+sb1.length());// uzunlugu 15
        System.out.println("sb1 capscity : "+sb1.capacity());// capasitesi 16
        System.out.println(sb1);//Java cok güzel3
        sb1.append(true);
        System.out.println("sb1 lengt : "+sb1.length());//19
        System.out.println("sb1 capscity : "+sb1.capacity());//34  eski kapasitenin iki katının iki fallasını veriyor.
        sb1.append("tum dersler java olsa");
        System.out.println("sb1 lengt : "+sb1.length());//40
        System.out.println("sb1 capscity : "+sb1.capacity());//70/
        sb1.trimToSize();// capasiteyi lengtin degerine eslitliyor.
        System.out.println("sb1 lengt : "+sb1.length());//40
        System.out.println("sb1 capscity : "+sb1.capacity());//40

    }
}
