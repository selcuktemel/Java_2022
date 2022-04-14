package day43_garbage_abstact;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractMethod();
    // abstract methodlar CHILD classların mutlaka OVERRİDE etmesi gereken methodlardır.
    // dolayisiyla HICBIRZAMAN direkt calistirilmazlar ve bu sebeple method body'sine ihtiyac yoktur.
    /* bir class'in veya method'un abstract olup olmadiini anlayabilir miyiz?
      -  abstract yaziyorrsa abstractir, yazmiyorsa abstract değildir.*/
    // (abstract olmayan classlard concrete class/method denir.
    /*
    Abstract methodlar body'e sahip olamaz
    Concrete methodlar ise method body'si olmadan olusturulamazlar.
     */


}
