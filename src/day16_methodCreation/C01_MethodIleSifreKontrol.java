package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        // “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali// ifleri bagımsız yaparak tek tek kontrol ettirdik.
        // bu 4 konrolü method ile yapin.


        String sifre = "Asdf12345a";
        // sifre methodla gidecek ve kontrol edilecek

        boolean ilkHarfKontrol=ilHarfKontrolEt(sifre);

        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);

        boolean boslukKontrol=boslukKontrolEt(sifre);

        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);
        if (ilkHarfKontrol&&sonHarfKontrol&&boslukKontrol&uzunlukKontrol){
            System.out.println("sifreniz basarılı bir sekilde tanımlandı");
        }else{
            System.out.println("islem basarısız tekrar giriniz");}
    }

        private static boolean uzunlukKontrolEt(String sifre) {

        boolean uzunlukKontrol = false;
        if (sifre.length() >= 8) {
            uzunlukKontrol = true;
        } else {
            System.out.println("en az 8 karakterli olmalı");
        } return uzunlukKontrol;
        }

        private static boolean boslukKontrolEt (String sifre){
            boolean boslukKontrolSonuc = false;

            if (!sifre.contains(" ")) {
                boslukKontrolSonuc = true;
            } else {
                System.out.println("sifreniz bosluk içermemelidir");
            }
            return boslukKontrolSonuc;
        }

        private static boolean sonHarfKontrolEt (String sifre){
            boolean sonHarfSonuc = false;
            char sonHarf = sifre.charAt(sifre.length() - 1);
            if (sonHarf >= 'a' && sonHarf <= 'z') {
                sonHarfSonuc = true;
            } else {
                System.out.println("sifreinizin son  harfi küyük olmalı");
            }
            return sonHarfSonuc;
        }

        private static boolean ilHarfKontrolEt (String sifre){
            char ilkHarf = sifre.charAt(0);
            boolean ilkHarfSonuc = false;

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                ilkHarfSonuc = true;
            } else {
                ilkHarfSonuc = false;// bunu yazmasakda od çalısır çünkü yukarıda false degerini ilHarfSonuc a atadık
                // yukarıdaki boolean ilharfsonuc=false yerine true olsaydı bunu mutklaka yazmalıyız.
                System.out.println("sifreinizin büyük harfi büyük olmalı");
            }

            // neden bir deger aadık null konusunu işlerken degeri olmayan bir seyi döndiremeceği için.
            return ilkHarfSonuc;
        }
    }


