package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        System.out.println("Hello World Yazdıran Javayı Halleder");
// bir variables oluştururken içerisibe koyacağımız datanın alabikleceği değerlere uygun bir data türü seçmeliyiz
        //öreneğin bir şehrin nufusundan bahsediyorsak variable'nin data türü (sring boolean, char,float, double ) olamaz
        // geriye kalan diğer data türlerinden birini şehrin büyüklüğüne göre birsi seçilebilir.
        int level =1;
        System.out.println(level);
        boolean ogrenciMi=true;
        boolean yagisVarMi=false;

        boolean emekliOlabilirMi =false;
        System.out.println("mehmet hoca emekli olabilir mi :"+ emekliOlabilirMi );

        char ozelSembol = '&';
        char sayi ='2';// char sadece bir karakater alabilir
        char harf ='K';
        System.out.println(harf);
        System.out.println(sayi);
        System.out.println(ozelSembol);
    }
}
