package day05_matematikselislemler;

public class C01_PrePostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;// sayıyı bir artırırdak

        System.out.println(sayi);//11


        sayi++;
        System.out.println("Pre Incrementten once    : " + sayi);//12

        // eger 11 ve 12 inci satırda yaptığım iki işlemi tek satırda yaparsam
        // java iki işlemden önce hangisini yapacağını bilmek ister
        // önce artırır sonra yazdırırsak java yeni değeri yazdırır ama
        //önce yazdırır sonra atırırsak , bu durumda eski değer yazdırılır

        System.out.println("Pre Increment satırında  : "+ ++sayi);//13 önce artır sonra yazsır
        System.out.println("Pre Incrementden sonra   : " + sayi);// 13

        System.out.println("Post Increment satırında : "+ sayi++);// önce yazdır sonra artır //13
        System.out.println("Post Incrementden sonra  : "+ sayi);//14

    }
}
