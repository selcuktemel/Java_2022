package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[]={"S","M","A","T"};//nasıl declara ettiysek öyle tutar
        System.out.println(Arrays.toString(arr));//[S, M, A, T]

        //eger sramala yapak istersek sort methodunu kullanmamız gerek

        Arrays.sort(arr);// atama yapmaya gerek olmadan sıralamayı degiştirdi
        System.out.println(Arrays.toString(arr));//[A, M, S, T]// ALFABETİK SIRAYA DİZDİ
        //javada bu sıralamaya Natural Order denir.
        //sayi olursa kücükten büyüge metin olurda alfabetik sıralamaya göre



    }
}
