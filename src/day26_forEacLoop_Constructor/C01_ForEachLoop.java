package day26_forEacLoop_Constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 11};

        // elenmeentleri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // bunu for each loop ile yapalim
        // for each loopu çalışrımak için hedef bir collection vermeliyiz-->
        // 1 - önce ban getireceği data türünün en eolcağını gireceğiz
        // 2- getirilen her elemente bir ad veriyoruz.genelde each kullınır
        //
        for (int each : arr)// arr array ine git her birini getir sonra ne yapacaüım
        {
            System.out.print(each + " ");
        }
//each lopların  avantajı index baslangıc değeri bitis değeri gibi detaylarla ugraşmamıza gerek kalmadan
// collectionsdan tüm elementleri bize getirir.
        // dezavantajı : indexe baglı bir işlem yapamayız.

    }
}
