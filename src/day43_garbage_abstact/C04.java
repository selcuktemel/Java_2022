package day43_garbage_abstact;

public abstract class C04 {

    /*
    bir abstract classda abstract veya concrete methodlar bulunabilir
    Child Class'larin abstract methodlari override etmesi MECBURİ iken
                      concrete methodlarin override edilmesi OPSİYENEL'dir.
     */


    public abstract void absMethod1();

    public void concreteMethod(){
        System.out.println("C04 concrete method");

    }

    public static void main(String[] args) {

      //  C04 obj = new C04()
                //C04' is abstract; cannot be instantiated
        /*
        ABSTRACT classlar constructor a sahiptir ancak Abstract claslardan Obje OLUSTURULAMAZ */
        // ABSTRACT classlar OBJE BARİNDİRMAYAN SADECE child classlar icin uyulmasi sart olan veya opsiyonel bırakilan
        //ozellikleri tanımladıgımız bir depo class gibidir.

        /*
        o zaman main methoda ihtiyac yok cünkü abstract bir method static olamaz. hem her yerden usalılabilir olsun hem
        abstract olsun olmaz. main method olusmasına itiraz etmez
         */
        // obje uretemiyorz. static methodlar abstract değilse main methoddan ulasabiliryorz..

    }

}
