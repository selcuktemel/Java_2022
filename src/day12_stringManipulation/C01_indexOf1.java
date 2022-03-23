package day12_stringManipulation;



public class C01_indexOf1 {
    public static void main(String[] args) {
//Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // Kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis


        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac ";
        String kelime= " ";
        int ilkKullanım=cumle.indexOf(kelime);// -1  veya index e  " " için 4
        int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);// " "15

        if(ilkKullanım==(-1)){// ilk degeri ise cumlede yok, geri kalan kısım cümlede var bir mi iki mi ona bakıyoruz
            System.out.println("girilen kelim : "+ kelime+" cümlede hiç kullanılmamıştır");
        } else if(ikinciKullanım==(-1)){ //cumlede ikinci kullanımın olup olmadığını kontol etmek için yine ikinciKullanımı==(-1) olup olmadıgını kontrol ediyororuz
            // yani şunu diyoruz zaten birinci var cünkü hiç kullanım yok
            System.out.println("girilen kelim : "+ kelime+" cümlede 1 kere kullanılmamıştır");
        }else {
            System.out.println("girilen kelim : "+ kelime+" cümlede birden fazla kullanılmamıştır");
        }



    }

}
