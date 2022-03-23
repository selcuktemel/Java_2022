package day12_stringManipulation;

public class C02_LastIndex {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // Kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis


        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac ";
        String kelime = "yeni ";
        int ilkKullanım = cumle.indexOf(kelime);// -1  veya index e  " " için 4
        int sonKullanım = cumle.lastIndexOf(kelime);
        if (ilkKullanım == (-1)) {
            System.out.println("girilenen kelime cümlede kullanılmamıs");
        } else if (ilkKullanım == sonKullanım) { // ilkkullanım indeksi en bastan "yeni" kelimesini aratmış ve yeniyi 13 üncü satırda bulmutur,
            // sonKullanım sondan başlayarak "yeni" kelimesini aratmış ve yeniyi 30 üncü satırda bulmutur
            System.out.println("girilen kelime cumlede 1 kere kullanılmıstır");
        } else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanılmıstır");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("p", 4));//4 dahil



    }
}
