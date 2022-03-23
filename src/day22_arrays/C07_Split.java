package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gün gectikce guzellesiyor";
        str.split(" ");// space den bu stringi böl space leri bulur buldugu spaceleri öldürür yerine virgül yazar ve Array e dönüsür.
        //su hale dönüsür "Java","gün",gectikce","güzellesiyor" olarak yapar. ancak bunu ARRAY bir varible atamalıyız

        String kelimeler[] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Java, gün, gectikce, guzellesiyor] olarak yazdırır Java bir virgül ve bosluk bırakır

        String gectikce[] = str.split("gectikce");// gidip gectikceyi bulacak ve onu öldürecek ancak bosluklar kalacak.
        System.out.println(Arrays.toString(gectikce));//[Java gün ,  guzellesiyor] , den sonra iki bosluk var

        String harfler[]=str.split("");// hiclikten split ederseniz J den baslar ve sırayla her harfin, boslugun, karakterin, işaretin,vb. arasına virgül koyar.
        System.out.println(Arrays.toString(harfler));//[J, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]
// avantajı kelimelerine ayırıp


    }
}
