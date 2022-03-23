package day16_methodCreation;

public class C04_forLoop {
    public static void main(String[] args) {
        // verilen Stringi tersten yazdiran bir kod yaziniz.

        String str = "Java cok zevkli bir konu";


           for (int i = str.length() - 1; i >= 0; i--) {
            // ne dedik int i degiskeni olusturduk. kendimiz i yerine baska bir isim de verebilriz.
            // soru bizden verilen String'İ tersten yazdırmamızı istiyor.
            // int i=baslangıç degeri(baslangıç degerimiz ne: str.length()-1 yani "u" harfinin uzunluk değeri 23)
            // 23'den basladı, i >= nereye kadar gidecek, i>=0; "i", "0"a esit oluncaya kadar gidecek ve "0" da duracak.
            //i-- burası, baslangıc degerinden, gideceğimiz yere kadar nasıl gideceğimizi, yani artırarak mı azaltarak mı gideceğiz
            // onu veriyor.
            // kısaca 23'üncü index degeri olan "u" dan basladık ve i-- azaltarak 0'a kadar gittik ve 0'da durduk.
            System.out.print(str.substring(i, i + 1));
            //yazdırırken, i yani 23'den baslayıp, i+1 yani 23+1 24 görünce duracak
            // yazdırma işleminde "unok rib ilkvez koc avaJ"
                                //23......................0
                                //24 basa geldi ve durdu.

//sadece System.out.println(str.substring(i)); yazdırırsak
// 23'den baslayıp 0'ı görünceye kadar azaltarak yazdırıyor,.
// azalan index degeri.
/*
u 23
nu 22,23
onu 21,22,23
konu
 konu
r konu
ir konu
bir konu
 bir konu
i bir konu
li bir konu
kli bir konu
vkli bir konu
evkli bir konu
zevkli bir konu
 zevkli bir konu
k zevkli bir konu
ok zevkli bir konu
cok zevkli bir konu
 cok zevkli bir konu
a cok zevkli bir konu
va cok zevkli bir konu
ava cok zevkli bir konu
Java cok zevkli bir konu 0,1,2.........21,22,23
             */

        }

    }
}
