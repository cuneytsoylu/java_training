package OdevDosyaları.bayramOdev;

public class K29 {
    public static void main(String[] args) {

         /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */

        String input="ABCDEF";

        for (int i =1; i <=input.length() ; i++) {
            for (int j =1; j <=i ; j++) {

                System.out.print(input.substring(j-1,j)+" ");


            }
            System.out.println(" ");
        }



        int harf=65;


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {


                System.out.print((char)(harf+j)+" ");

            }
            System.out.println(" ");
        }
    }
}
