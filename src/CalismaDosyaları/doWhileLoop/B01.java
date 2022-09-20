package CalismaDosyaları.doWhileLoop;

import java.util.Scanner;

public class B01 {




        public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            int sayi=0;


/*while(sayi%2==0){
    System.out.println("lutfen bir  sayi giriniz");
    sayi=scan.nextInt();
    if (sayi%2==0){
        System.out.println("girilen sayi cift : "+ sayi);
    }else System.out.println("girilen sayi tek : "+ sayi);

 */

            do {
                System.out.println("lutfen bir sayi giriniz");
                sayi=scan.nextInt();
                if (sayi%2==0){
                    System.out.println("girilen sayi cift : "+ sayi);
                }else System.out.println("girilen sayi tek : "+ sayi);
            }while (sayi%2==0);

        }



    }


