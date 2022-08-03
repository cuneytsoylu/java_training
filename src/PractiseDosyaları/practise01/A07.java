package PractiseDosyaları.practise01;

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1.tamsayiyi giriniz");
        int t1=scan.nextInt();
        System.out.println("lutfen 2.tamsayiyi giriniz");
        int t2=scan.nextInt();
         int t3=t1+t2;
        System.out.println("girmiş oldugunuz "+t1+" ve " +t2+" sayilarinin toplami "+t3+" olur");


    }
}
