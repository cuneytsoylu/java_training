package CalismaDosyaları.forloop;

import java.util.Scanner;

public class Codevsoru11 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 10 dan kucuk bir sayi giriniz");
        int sayi=scan.nextInt();
        int fak=1;
        if (sayi<1 ){
            System.out.println("girdiginiz sayinin faktoriyeli alınamaz" );
        } else if (sayi ==0) {
            System.out.println("girdiginiz sayinin faktoriyeli sifir(0) a esittir ");


        }else{
            for (int i =1; i <=sayi ; i++) {
                fak*=i;

            }
            System.out.println("girdiginiz sayinin faktoriyeli : "+fak);
        }


    }
}
