package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K08 {
    public static void main(String[] args) {

        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int sonIki=0,ilkIki=0;

        sonIki+=sayi%100;
        ilkIki+=sayi/1000;
        System.out.println("girdiginiz sayinin ilk iki ve son iki basamaklarinin toplami : "+(sonIki+ilkIki));
int toplam1=0,toplam2=0;
        int son=sonIki%10;
        toplam1+=son;
        toplam1+=sonIki/10;
        toplam2+=ilkIki%10;
        toplam2+=ilkIki/10;

        System.out.println("girdiginiz sayinin ilk iki ve son iki basamaklarindaki rakamlarin toplami : "+(toplam1+toplam2));

    }
}
