package day06_concatentionoperat_operators;

public class C02_Mantiksal {
    public static void main(String[] args) {
        System.out.println(5+2==8);//false

        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;// sarı renkte olmasının nedeni sabit olduğu için bunun sonucunun
        // daima true olacağını java belirtiyor

        System.out.println(sonuc1);


        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;

        System.out.println(sonuc2);


        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;


        System.out.println(sonuc3); //false

        // && ile & arasındaki fark

        int sayi3=15;
        // bu sayının 10 ile 20 arasında olduğunu gösterin
        // java üçlü karşılaştırma kabul etmez
        // ikili karşılastrmalar yapı mantıksal operattörlerle birleştirmaliyi.

        System.out.println(sayi3<20&&sayi3>10);
int sayi4=5;
// sayi4'ün 10 ile 20 arasında olmadığını true diyerek döndürelim
// aralıkta olursa ve && aralık dışında diyorsak veya ||
        System.out.println(sayi4<10||sayi4>10);




    }
}
