package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tam sayi alip  while loop ile sayida kücük pozitif tam sayilari yazdiralim.

        int input=3;
        int sayi=1;



        while (sayi<input){
            System.out.println(sayi);

            sayi++;
        }



        // aynı soruyu do-While loop ile yapalim
        sayi=1;

        do{
            System.out.println(sayi);

            sayi++;
        }while(sayi<input);

    }
}
