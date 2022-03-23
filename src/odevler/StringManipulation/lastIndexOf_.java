package odevler.StringManipulation;

public class lastIndexOf_ {
    public static void main(String[] args) {
String cumle=" Java ogren,yeni program ile yeni bir sayfa ac.";
String kelime="iri";
int ilkKullanım=cumle.indexOf(kelime);
int sonKullanım=cumle.lastIndexOf(kelime);

        System.out.println(ilkKullanım);//11 inci indexden itibaren baslıyor
        System.out.println(sonKullanım);//28 inci indexden itibaren baslıyor

        if (ilkKullanım==-1){
            System.out.println("\"" + kelime+"\"" + " " + cumle +" icerisinde kullanılmamıstır." );
        }else if(ilkKullanım==sonKullanım){
            System.out.println("\"" + kelime+"\"" + " " + cumle +" icerisinde 1 kere kullanılmıstır.");
        }else{
            System.out.println("\"" + kelime+"\"" + " " + cumle +" icerisinde birden cok kullanılmıstır." );
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",5));





    }
}
