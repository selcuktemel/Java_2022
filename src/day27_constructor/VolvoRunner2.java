package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {

// her obje olusturdugumuzda model, yakit gibi degerleri tek tek atama yapmak istemiyorsaniz
        Volvo araba1 = new Volvo("CX60", false, 2023, "Benzin");

        System.out.println(araba1.toString());//Model : CX60, Yakit : Benzin, Max hiz : 240
// bir objeyi olusturmak böyle daha kolay olmuştur.
        System.out.println(araba1);//Model : CX60, Yakit : Benzin, Max hiz : 240

    }
}
