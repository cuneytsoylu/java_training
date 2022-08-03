package CalismaDosyaları.whileLoop;

public class CodevSoru4 {
    public static void main(String[] args) {

       char ilkHarf='a';
       char sonHarf='c';
        char temp=ilkHarf;

        String buyult="";


        while (temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+ " ");
            temp+=1;
        }

    }
}
