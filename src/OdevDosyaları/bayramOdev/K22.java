package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K22 {
    public static void main(String[] args) {

        /*
         * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
         * olanlarini konsola yazdiriniz int num1 int num2 int num3
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
int sayi1=scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("lutfen ucuncu sayiyi giriniz");
        int sayi3=scan.nextInt();
        
        if (sayi1>sayi2 && sayi1>sayi3) {
            System.out.println(" girilen sayilar icinde en buyuk sayi : " +sayi1);
        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
            System.out.println(" girilen sayilar icinde en buyuk sayi : " +sayi2);
        }else if (sayi3 > sayi2 && sayi3 > sayi1) {
            System.out.println(" girilen sayilar icinde en buyuk sayi : " +sayi3);
        }if (sayi2 > sayi1 && sayi3 > sayi2) {
            System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi1);
        }else if (sayi1 > sayi2 && sayi3 > sayi2) {
            System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi2);
        }else if (sayi2 > sayi3 && sayi3 <  sayi1){
            System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi3);
        }
    }
}
