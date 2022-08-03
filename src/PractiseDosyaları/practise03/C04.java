package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        if (yas >0&&yas<18){
            System.out.println("yasiniz 18 den kucuk oldugu icin kan bagisi yapamazsiniz");
         }else if (yas>=18){
            if (kilo>0&&kilo<50){
                System.out.println("kilonuz 50 kg den az oldugu icin kan bagisi yapamazsiniz");

            }else if (kilo>=50){
                System.out.println("uygun sartlar saglandigindan kan bagisi yapabilirsiniz");
            }
        }


    }
}
