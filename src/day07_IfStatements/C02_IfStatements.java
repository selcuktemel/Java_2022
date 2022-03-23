package day07_IfStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;


        if (a>b&&b<100) {// bu şart doğruysa body deki tüm kodlar çalışır yanlışsa hiç biri çalışmaz
            System.out.println("isteğiniz gerçekleşecek");
            System.out.println("body içindeki tüm kodlar çalışır");
        }

        if (a<0) System.out.println("süslü parantez olmazsa sadece bir satır çalışır");// if cümlesinin arkasına yazılan sout noktalı virgüle kadardır.
        // bir if cümlesinin daha anlasilir olmasını istiyorsanız if bodysini {süslü parantez} içine yazmalısınız
        //body i {} süslü parantez içine yazmasak da if cümlesi çalışır ancak ilk noktalı virgülde ; if cümles bitmiş olur.
        // noktalı virgülden sonraki kodlar bağımsızdır.

        //21 ve 22'nci satırdaki kod 15 inci satıdaki if dogru olsada calısır false olsada çalısır
        System.out.println("ikinci satır da çalıştı");
        System.out.println("super");

    }
}
