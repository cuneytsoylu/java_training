package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K18 {
    public static void main(String[] args) {
 /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();
        System.out.println("lutfen kilonuzu kg olarak giriniz");
        double kilo=scan.nextDouble();

        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20){
            System.out.println("bmi degeriniz: "+bmi+" oldukca zayifsiniz");
        }else if(20<bmi && bmi<=25){
            System.out.println("bmi degeriniz: "+bmi+" normal sinirdasiniz");
        }else if(25<bmi && bmi<=30){
            System.out.println("bmi degeriniz: "+bmi+" sisman kategorisindesiniz");
        }else if(30<bmi){
            System.out.println("bmi degeriniz: "+bmi+" obez grubundasiniz");
        }


    }
}
