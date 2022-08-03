package CalismaDosyaları.whileLoop;

public class CodevSoru3 {
    public static void main(String[] args) {
//baslangıztan bitise olan cift sayıları yazdiralim


        int bas=20;
        int bitis=50;
        int temp=bas;

        while (temp<=bitis) {

            if (temp%2==0){

                System.out.print(temp+" ");

            }temp++;
        }

    }
}
