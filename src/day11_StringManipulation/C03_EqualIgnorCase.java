package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualIgnorCase {
    public static void main(String[] args) {

        //kullanıcıya derse katılıp katılmak istemdiğini sorun evet derse derse katılımınız sağlanmılştır
        //hayır derse " cevanımı be sonraki derslerimize bekleriz


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen derse girmek isteyip istemediğiniz belirtin");
        String cevap=scanner.next();

        if(cevap.equalsIgnoreCase("evet")){
            System.out.println("cevap = " + cevap+ " derse katılımınız sağlanmıstır");

        }
        else if(cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevap = " + cevap+" sonraki derse bekleriz");
        }
        else {
            System.out.println(" lütfen gecerli bir ceap girniz" );
        }
    }
}
