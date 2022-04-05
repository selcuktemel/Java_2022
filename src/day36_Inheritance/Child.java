package day36_Inheritance;

public class Child extends Parent{
    Child (int i){
        super();// var ama yok :)
    }


    Child (){
        this(6);
        System.out.println("Child Cons calisti");
    }

    public static void main(String[] args) {

        Child child = new Child();


        // extends kelimesi olunca isler degisiyor.
        // cunku bizi objemiz her ne kadar child clasından olsada parent classında butun ozellerikerine sahip
        // arka planda Parent classınnda calısması lazım
        /*
        java bunu nasıl yapıyor. butun classlarda biz görmesekde javanın olustudugu defaul constructor vardir,

        extends keyword kullanan tum CONSTRUCTORLARIN İLK SATIRINDA BİZ GÖRMESEKDE super() constructor vardır.
        yani Parent Classın parametresiz constructor call'ı

        extends yoksa super() yok,
         */
    }
}
