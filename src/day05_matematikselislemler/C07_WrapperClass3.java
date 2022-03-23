package day05_matematikselislemler;

public class C07_WrapperClass3 {
    public static void main(String[] args) {
        String srt1="12345";
        String str2="23456";

        // verilen iki String'deki sayıları toplayın

        System.out.println(srt1+str2);

        System.out.println(Integer.valueOf(srt1) + Integer.valueOf(str2));

        // Integer.valueOf(str1+str2 ) // yapinca olmuyor yapmayin böyle bir durumda önce parantez içini yapacağı için
        // zaten yapamadığımız için Wrapper Classları kullanıyoruz

        // Integer.valueOf(); METHODU sadece sayısal değer içeren stringlerde kullanılabilir.
        // bir tane bile sayı dışında karakter olursa Java hata verir




    }
}
