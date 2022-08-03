package CalismaDosyaları.nestedForLoop;

public class A04 {
    public static void main(String[] args) {
        /*
        verilen input a göre yıldızlardan
        olusan bir ucgen olusturun
         */

int input=5;

        for (int i = 1; i <=input ; i++) {

            for (int j =1; j <=i ; j++) {
                System.out.print(" *");

            }
            System.out.println("");


        }



    }
}
