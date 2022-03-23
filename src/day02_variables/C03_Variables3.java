package day02_variables;

public class C03_Variables3 {
    public static void main(String[] args) {
        String ogrenciIsmi ="Melih";
        ogrenciIsmi ="Furkan";
        ogrenciIsmi ="Abdullah";
        // bir variable daclare edildikten sonra istediğimiz kadar değer değişimi yapabiliriz
        // ancak declare edilen bir variable tekrar declare edilemez.
       //  String ogrenciIsmi ="Abdullah";
String isim,soyisim,dogumYeri;

        isim="Selcuk";
        soyisim="Temel";
        dogumYeri="Malatya";
 int maaş=5000, yas=44,boy=176;
// data türünün ortak olması gerekiyor.
        System.out.println(dogumYeri);
        System.out.println(isim+" "+soyisim+" "+dogumYeri);
        System.out.println(maaş+" "+ yas+" "+boy);

        // String non-primitive olduğu için bizim sadece data salkalmak değil
        // ekstra bazı özellikleri de kullanabiliyoruz
        // eğer tc no okul numarısı ve telnumarsı gibi kendisi sayısal olan ancak matemeatiksel bir işlemde kullanımayan
        // derğler için STRİNG KULLANILABİİR.

        String harf="A";
        char harf2='A';
        // BU İKİSİ İÇİNDE AYNI DURUM GEÇERLİ
        // BEN A HARFİ İÇİN BİR VARİABLEYİ CHAR OLARAK DA OLUŞTURABİLİRİM String olarak da oluşturabilriim
        // eğer sadece saklaycaksak char kullanılabilir ama
        // String in özelleklerinden istifade etmek için String olarak tanımlamak daha avantajlı olablilir




    }
}
