package Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    /*
    soru5:
    Kullanicidan alarak olusturacaginiz dizinin en buyuk ve en kucuk degerlerini bulunuz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dizinin uzunlugunu giriniz");
        int uzunluk=scan.nextInt();
        int[] arr=new int[uzunluk];
        int enBuyuk=0;
        int enKucuk=0;
//1.yol
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Dizinin "+(i+1)+".elemanini giriniz");
            arr[i]=scan.nextInt();
            if (i==0){
                enBuyuk=arr[i];
                enKucuk=arr[i];
            }if (arr[i]>enBuyuk){
                enBuyuk=arr[i];
            }if (arr[i]<enKucuk){
                enKucuk=arr[i];
            }
        }
        System.out.println("array in en buyuk elemani : "+enBuyuk);
        System.out.println("array in en kucuk elemani : "+enKucuk);

//2.yol
        Arrays.sort(arr);
        enBuyuk=arr[arr.length-1];
        enKucuk=arr[0];
        System.out.println(enBuyuk);
        System.out.println(enKucuk);

    }
}
