package odevler.forLoop_;

public class ForLoop7 {
    public static void main(String[] args) {
/*
Soru 3) 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
yazdirin

 */

        for (int i = 100; i >=51; i--) {
            System.out.print(i+ " ,");

        }
        System.out.println("50");

        for (int i = 100; i >=50; i--) {
            if (i >50) {
                System.out.print(i+ " ,");
            }else {
                System.out.print(i);
            }

        }





    }
}
