package CalismaDosyaları.execeries;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {

       sayiAl( 5);






    }

    public static void sayiAl(int sayi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1=scan.nextInt();

        if (sayi1>0){
            System.out.println("sayi pozitif");
        }else if (sayi1<0){{
            System.out.println("sayi negatif");}
        }else System.out.println("sayi nötr");







    }
}
