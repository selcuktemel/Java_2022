package odevler.StringManipulation;

import java.util.Scanner;

public class O07_lenght {
    public static void main(String[] args) {
        //// length() method'u girilen String'in uzunlugunu verir eger lengh methodunun str.charAt(str.length()-1)
        // olarak yazarsak bize sonucu char olarak döndürecek ve en sondaki harfi verecektir. mesela kullanıcının gireceği cümle(java cok güzeldir)
        //biz son karakterin ne olduğunu bulanbilmek için yukarıdaki str.charAt(str.lengt()-1) yazmalıyız.
        // Sonuc olarak length() methodu bize sonucları int olarak döndürürken str.charAt(str.lengt()-1) methodu char olarak döndürür
        //ornek kullanıcıdan bir kelime alın ve bibirci ikinci harflerini kücük  ve sondan bir önceki ve son harfini büyük yazdırın.
        // char'ları yazdırınken matematiksel işlemler kullanıldığında işleme ASCİİ değerleri işleme girdikleri için en basa "" hiçlik koymakta fayda var.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime =scanner.nextLine();

        System.out.println(""+ kelime.toLowerCase().charAt(0) +kelime.toLowerCase().charAt(1)+
                            kelime.toUpperCase().charAt(kelime.length()-2)+kelime.toUpperCase().charAt(kelime.length()-1));




    }
}
