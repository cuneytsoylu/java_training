package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        double bmi=kilo/((boy*boy)/10000);
        if (bmi<=20){
            System.out.println("bmi niz : "+bmi +" oldukca zayifsiniz");
        }else if (bmi>20 && bmi<=25){
            System.out.println("bmi niz : "+bmi +" normal sinirdasiniz");
        }else if (bmi>25 && bmi<=30){
            System.out.println("bmi niz : "+bmi +" sisman kategorisindesiniz");
        }else if (bmi>30){
            System.out.println("bmi niz : "+bmi +" obez grubundasiniz");
        }else System.out.println("bmi niz hesaplanamadi");
    }
}
