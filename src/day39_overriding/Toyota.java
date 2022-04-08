package day39_overriding;

public class Toyota extends Araba {

    String hiz = "Toyota araclar max 220 km hiz yapar";
    String marka = "Toyota";
    String sirketMerkezi = "Japonya";

    public void motor() {
        System.out.println("Arabalar toyota marka motor kullanırlar");
    }


    public void garanti() {
        System.out.println("toyota araclar 10 yil garantilidir.");
    }

}

