package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
         int birlerBasamagi=0,onlarBasamagi=0,yuzlerBasamagi=0;

         birlerBasamagi+=sayi%10;
         onlarBasamagi+=(sayi/10)%10;
         yuzlerBasamagi+=(sayi/100);

        System.out.println("Girdiginiz sayinin birler basamagi : "+birlerBasamagi);
        System.out.println("Girdiginiz sayinin onlar basamagi : "+onlarBasamagi);
        System.out.println("Girdiginiz sayinin yuzler basamagi : "+yuzlerBasamagi);




    }
}
