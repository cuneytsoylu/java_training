package Ornekler;

import java.util.Scanner;

public class Soru7 {
    /*
    soru7:
    kullanicidan alinan dizinin ortalamasını hesaplayan programi yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dizin boyutun giriniz");
        int uzunluk=scan.nextInt();
        int array[]=new int[uzunluk];
int toplam=0;
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("lutfen arrayin "+(i+1)+".elemanini giriniz");
            array[i]=scan.nextInt();
            toplam+=array[i];
        }
        System.out.println("arrayin ortalamasi : "+(toplam/uzunluk));




    }
}
