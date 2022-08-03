package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B09 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinici vize notunuzu giriniz");
        double vize1=scan.nextDouble();
        System.out.println("lutfen ikinci vize notunuzu giriniz");
        double vize2=scan.nextDouble();
        System.out.println("lutfen final notunuzu giriniz");
        double finalsinavı=scan.nextDouble();
        double sonuc=(vize1+vize2)/2*0.3+finalsinavı*0.7;
        System.out.println("gecme notunuz : "+sonuc);

    }
}
