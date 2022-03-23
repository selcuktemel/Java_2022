package day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        /*
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
 String str1 = “$13.99”
 String str2 = “$10.55”
 ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
         */
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.substring(1);
        str2 = str2.substring(1);
        double toplam=Double.parseDouble(str1)+Double.parseDouble(str2);
        System.out.println("toplam = $" + toplam);

        //ikinci versiyon
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        System.out.println("Stringlerin toplamı : "+ str1+str2);//13991055 yanyana yazdı
        //once bunları sayıya cevirmeliyiz double a cevireceğiz
        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);

        double sonuc=(str1Sayi + str2Sayi)/100;

        System.out.println("verilen string sayıların toplamı $" + sonuc);

    }
}
