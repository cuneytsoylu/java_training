package CalismaDosyaları.forloop;

import java.util.Scanner;

public class CodevSoru4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 100 sayisindan kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();
        if (sayi > 100) {
            System.out.println("girdiginiz sayi 100 den buyuk,lutfen 100 sayisindan kucuk bir tamsayi giriniz");
        } else if (sayi < 100) {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
     }
    }
