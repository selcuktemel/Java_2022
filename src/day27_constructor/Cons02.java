package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01();//default consturctor devrede
       // Cons01 classinda hiç constructor olusturmazsak yokken JAava default constructor u kullandigindan obj1 i uretebildik
       // Ancak biz parametreli veya parametresiz bir constructor yazdiğimizda Java default constructor i siler.
       // Dolayısıyla biz herhangi bit constuctor olusturdugumuzda daha önce baska classlar veya kullanıcıların olusturmus olabilecegi
       // objeleri kullanabilmeleri için default constructor un işlevini gerçekleştirecek bir consturctor olussturmakda fayda var


        Cons01 obj2=new Cons01("Java");
        /// her classs da default consructor vardırk biz elimzde bi rparametre atarsak java defauşt contructor öldürür.

    }
}
