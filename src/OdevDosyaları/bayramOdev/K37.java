package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K37 {
    public static void main(String[] args) {
              /*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
      */

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
       double sayi1=scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
      double sayi2=scan.nextInt();
double sayi3=1;
double sayi4=1;
double sayi5=1;
        for (double i =sayi1; i >=1 ; i--) {
               sayi3*=i;

        }
        for (double i =sayi2; i >=1 ; i--) {
            sayi4*=i;

        }
        for (double i =sayi1-sayi2 ; i >=1 ; i--) {
            sayi5*=i;

        }
        double sonuc=sayi3/(sayi4*sayi5);

        System.out.println(sonuc);
    }
}
