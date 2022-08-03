package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
       int yas=scan.nextInt();
       if (yas<18){
           System.out.println("oy kullanamazsin");



       }else if(yas>=18 && yas<50){
           System.out.println("bir defa oy kullanabilirsin");
        }else if (yas>50&&yas<70){
           System.out.println("iki kez oy kullanabilirsin");

        }else if(yas>=70){
            System.out.println("uc defa oy kullanabilirsin");
        }





    }
}
