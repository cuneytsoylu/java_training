package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B06 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
         int sonikirakam=sayi%100;
         int ilkiki=sayi/1000;
       int  ilkikirakamtop=ilkiki/10+ilkiki%10;

       int sonikirakamtop=sonikirakam/10+sonikirakam%10;
       int rakamlartoplami=ilkikirakamtop+sonikirakamtop;


        System.out.println("girmis oldugunuz sayinin sonucu: "+rakamlartoplami);

    }
}
