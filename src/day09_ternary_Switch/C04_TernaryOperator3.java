package day09_ternary_Switch;

public class C04_TernaryOperator3 {
    public static void main(String[] args) {
        // verilen sayının pozitif mi negatif mi olduğnu kontrol edip,
        // o veya pozitif sayı ise tek ve ya çift
        //  negatif ise -100 den büyük vey aküçük olduğunu belirleyen


        int sayi =220;
        if (sayi>=0) {
            if (sayi%2 == 0) {
                System.out.println("pozitif çift");
            }else {
                System.out.println("sayı pozitif tek sayı");
            }
        }else {
            if (sayi < -100) {
                System.out.println("sayı -100 den kücük negatif sayı");
            } else {
                System.out.println("sayi -100 den büyük sayi");
            }


        }
        System.out.println(sayi >=0?
                          (sayi%2==0?"pozitif çift sayi":"sayi pozitif tek say"):
                          (sayi<-100?"sayı -100 den kücük negatif sayı":"sayi -100 den büyük sayi"));
    }
}
