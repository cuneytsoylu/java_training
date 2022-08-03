package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen uc haneli bir sayi giriniz");
        int sayi = scan.nextInt();
        int yuzlerb = sayi / 100;
        int onlarb = (sayi / 10) % 10;
        int birlerb = sayi % 10;
if (sayi>99 && sayi<1000) {
    switch (yuzlerb) {
        case 1:
            System.out.println("yuz");
            break;
        case 2:
            System.out.println("ikiyuz");
            break;
        case 3:
            System.out.println("ucyuz");
            break;
        case 4:
            System.out.println("dortyuz");
            break;
        case 5:
            System.out.println("besyuz");
            break;
        case 6:
            System.out.println("altiyuz");
            break;
        case 7:
            System.out.println("yediyuz");
            break;
        case 8:
            System.out.println("sekizyuz");
            break;
        case 9:
            System.out.println("dokuzyuz");
            break;
    }

    switch (onlarb) {
        case 1:
            System.out.println("on");
            break;
        case 2:
            System.out.println("yirmi");
            break;
        case 3:
            System.out.println("otuz");
            break;
        case 4:
            System.out.println("kırk");
            break;
        case 5:
            System.out.println("elli");
            break;
        case 6:
            System.out.println("altmis");
            break;
        case 7:
            System.out.println("yetmis");
            break;
        case 8:
            System.out.println("seksen");
            break;
        case 9:
            System.out.println("doksan");
            break;
    }
    switch (birlerb) {
        case 1:
            System.out.println("bir");
            break;
        case 2:
            System.out.println("iki");
            break;
        case 3:
            System.out.println("uc");
            break;
        case 4:
            System.out.println("dort");
            break;
        case 5:
            System.out.println("bes");
            break;
        case 6:
            System.out.println("alti");
            break;
        case 7:
            System.out.println("yedi");
            break;
        case 8:
            System.out.println("sekiz");
            break;
        case 9:
            System.out.println("dokuz");
            break;
    }

}else System.out.println("lutfen uc basamakli sayi giriniz");
    }
}
