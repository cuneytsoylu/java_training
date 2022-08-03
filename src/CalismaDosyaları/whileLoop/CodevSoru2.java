package CalismaDosyaları.whileLoop;

public class CodevSoru2 {
    public static void main(String[] args) {

int input=1000;
        for (int i =1; i <=input ; i++) {

            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }

        }
        System.out.println(" ");

        int temp=1;

        while (temp<1000){
            if (temp%15==0 && temp%20==0 && temp%90==0){
                System.out.print(temp+" ");
            }temp++;

        }




    }
}
