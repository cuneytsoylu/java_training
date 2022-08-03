package CalismaDosyaları.forloop;

import java.util.Scanner;

public class CodevSoru9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String palindrom=scan.next();
        String isim="";
        for (int i =palindrom.length()-1; i>=0 ; i--) {
            isim+=palindrom.substring(i,i+1);

        }if (palindrom.equals(isim)){
            System.out.println("girdiginiz kelime palindrom bir kelimedir");
        }else System.out.println("girdiginiz kelime palindrom bir kelime degildir");

    }
}
