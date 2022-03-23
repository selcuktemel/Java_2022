package day15_methodCreation;

public class C04_ {
// main mathod olmadıgı için bu class direkt çalısmaz, sadece depo görevi görür
// ancak baska classlardan kullanıcabilecek method veya variable'lari barindirir.

    public static void besharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );
    }

    public static void dortharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );
    }

    public static void ucharfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("girdiginiz kelimelerdeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi: "+ tersKelime  );
    }



}
