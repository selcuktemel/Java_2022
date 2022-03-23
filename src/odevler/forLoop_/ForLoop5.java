package odevler.forLoop_;

import java.util.Scanner;

public class ForLoop5 {
    public static void main(String[] args) {
// kullanıcıdan 100 den kücük bir tam sayi isteyin
        //1 den baslayarak girilen sayiya kadar tüm sayiları yazdirin
        // ancak 3 ün kati ise sayi yerine "java" yazdirin
        //sayi 5 in kati ise yarine güzeldir yazdirin
        //sayi hem 3 hem 5 kati ise java güzeldir yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("100den kücük tam bir sayi giriniz");
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("java güzeldir");
            } else if (i % 3 == 0) {
                System.out.println("java");
            } else if (i % 5 == 0) {
                System.out.println("güzeldir");

            }else{
                System.out.println(i);
            }
        }
    }
}
