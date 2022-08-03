package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.print("lutfen a sayisini giriniz: ");
        double a = scan.nextDouble();
        System.out.print("lutfen b sayisini giriniz: ");
        double b = scan.nextDouble();
        System.out.print("lutfen c sayisini giriniz: ");
        double c = scan.nextDouble();
        double sonuc=((a*a)-(b*b))/3*c;
        System.out.println("girilen verilerin istenen sonucu: "+sonuc);

    }
}
