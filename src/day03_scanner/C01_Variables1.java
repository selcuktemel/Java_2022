package day03_scanner;

public class C01_Variables1 {
    public static void main(String[] args) {
        //1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi="Yılsız Koleji";// Yıldız Koleji
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='k';
        System.out.println(ilkHarf);

        int sayi=10,sayi2=20;
        System.out.println(sayi+sayi2);

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //isminiz : Mehmet
        //soyisminiz : Bulutluoz
        //seklinde yazdirin
        String isim ="Mehmet";
        String soyisim="Bulutluoz";
        System.out.println("isminiz: "+ isim);
        System.out.println("soy isminiz: "+soyisim);
        System.out.println(isim+" "+ soyisim);
        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int rakam=10;
        byte rakam2=18;
        String ay =" subat";
        System.out.println(rakam+rakam2+ay);
        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int a =12;
        double b =12.4;
        System.out.println(a+b);
        //5 – char data turunde bir variable olusturun ve yazdirin
        char carakter='S';
        System.out.println(carakter);
        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin
        int c=25;
        char y='h';// 129  ascii taplosundaki kücük 'h' nin aldığı değeri alarak 25 ile toplar
        System.out.println(c+y);
    }
}
