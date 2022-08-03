package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mesafeyi giriniz");
double mesafe=scan.nextDouble();
        System.out.println("lutfen hizi giriniz");
        double hiz=scan.nextDouble();
        double süre=mesafe/hiz;
        System.out.println("giideceginiz yolun süresi : "+süre +" saattir");



    }
}
