package day43_garbage_abstact;

public class C05_ChildOfAbstract extends C04{
  //  Class 'C05_ChildOfAbstract' must either be declared abstract or implement abstract method 'absMethod1()' in 'C04'
    //'C05_ChildOfAbstract' sınıfı ya soyut olarak bildirilmeli ya da 'C04' içinde 'absMethod1()' soyut yöntemini uygulamalıdır.

/*
cLASIMİZİ BİR Abstract class'in child class'i olarak belirtmek isterse Java hemen class isminin altını kirmizi cizer
bizden child class'i abstract yapmamizi veya parent claslardaki abstract methodlari override etmemizi ister.
parent olan abstract class'daki concrete methodlar ise opsiyeneldir. onlari istersen override ederiz istemezsek override etmeiz.
 */
    // temel ihityac nerden cıkmıs : child classlari belli kaliplari olusturmaya mecbur etmek icin abstract class kullanilir.
    // abstract claslardan obje olusturulamaz ancak constructorlari vadir.
    // concrete ve abstract methodlara barindırabilir.
    //concrete bir classda abstract bir method olmaz.



    @Override
    public void absMethod1() {

    }
}
