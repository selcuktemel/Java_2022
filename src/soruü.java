public class soruü {
    public static void main(String[] args) {


        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i + input; j++) {
                  System.out.print(j + " ");

            }
            System.out.println("");
        }


    }
}