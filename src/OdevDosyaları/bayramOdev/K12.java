package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K12 {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci vize notunuzu giriniz");
        double vize1=scan.nextDouble();
        System.out.println("lutfen ikinci vize notunuzu giriniz");
        double vize2=scan.nextDouble();
        System.out.println("lutfen final notunuzu giriniz");
        double finalNotu=scan.nextDouble();

        double sonuc=(((vize1+vize2)/2)*0.3)+finalNotu*0.7;
        System.out.println("sınav sonucunuz : "+ sonuc);


    }
}
