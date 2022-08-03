package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B08 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lutfen boyunuzu m olarak giriniz");
        double boy=scan.nextDouble();

        double vki=kilo/((boy*boy));
        System.out.println("vucut kitle index iniz: "+vki);

    }
}
