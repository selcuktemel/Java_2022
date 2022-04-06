package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent  {
    Child(){
        super();//--> bunu cagırdı protected Parent(){System.out.println("Parent Cons. calisti");

        System.out.println("Child Class parametresiz const.");
    }
    /*
    bizim göremedigimiz bu kodlar. day36_Inheritance.Parent'a ulasmak istiyorlar ancak
    package'de bulunan Parent Construstor'unun Access Modifier'i DEFAULT . Biz Parent Classındaki
    Access modifieri protected veya public yaparsak sorun ortan kalkacakrtır.
     */
    Child(int s){
        /* Child class'da tüm constructorların ilk satirina Javanın yerlestirdiği super(); constroctor
        call PARAMETRESİSZDİR. super();*/
        System.out.println("Child Class parametreli const.");
    }

    Child(int sayi1 ,int sayi2 ){
        // eger parentten parametresiz constructor'ı degilde baska  bir constructor'i calistirmak isterseniz
        // bunu Child classdaki consructorın İLK SATIRINA YAZMALİSİNİZ.
        super(sayi1, sayi2);
        System.out.println("Child iki paremetreli const.");

    }

    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child(5);
        Child child3=new Child(5,8);
    }

/*

 */

}
