package Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru8 {
    /*
    iki boyutlu dizi degerlerini kullanicidan alma
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dizi[][]=new int[3][2];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("sayi giriniz");
                dizi[i][j]=scan.nextInt();
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(dizi[i][j]);
            }
        }
        System.out.println("");
    }


}
