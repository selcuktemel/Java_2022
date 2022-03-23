package day14_stringManipulation;

public class C02_TerstenYazdirmat {
    public static void main(String[] args) {
        // kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        // girilen kelimeyi ilk harfi büyük


        String input="Mavi";
        System.out.println(input.length());
        System.out.println(input.substring(input.length()-1));
        System.out.println(""+ input.charAt(3) + input.charAt(2) + input.charAt(1) + input.charAt(0));
        System.out.println(input.substring(3).toUpperCase()+
                           input.substring(2,3).toLowerCase()+
                           input.substring(1,2).toLowerCase()+
                           input.substring(0,1).toLowerCase());

    }
}
