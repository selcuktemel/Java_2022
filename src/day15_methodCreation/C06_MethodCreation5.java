package day15_methodCreation;

public class C06_MethodCreation5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // iki variable'nın degerlerini toplayan bir method olusturalım
        // 1- method olusturmak icin methodun adını yazarız

        // 2- methoda giderken goturmem gereken variable varsa bunu methoda eklemeliyim.

        ikiSayiTopla(25, 50);// creat method dediğimizde java asagıdaki mathodu bize olusturuyor
        C04_.dortharfiTersineCevir("sema");


    }
// bir methodu olusturmak çalısması için yeterli degildir method ancak cagrılırsa çalısır.
    // bir methoddun çalısması için mutlaka çagrılması gerekir.
    // nasıl çağırıyoruz.
    // aynı class veya farklı class'da olmasının hiçbir önemi yoktur.
    //java main methodDA yukarıdan asagıya dogru çalisir ve geldiği satiri çalıstırır.

    private static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen iki sayinin toplami : " + (a + b));
    }
}
