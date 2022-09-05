package Exceptions;

import java.util.Scanner;

public class A03_ThrowsException {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();


       try {mekanKontrol(yas);} catch (Exception e) {
           System.out.println("kodu hallettik devam");
       }


    }

    private static void mekanKontrol(int yas) throws ClassNotFoundException {


        if (yas<18){
            throw new ClassNotFoundException() ;

        }else {
            System.out.println("Mekana hosgeldiniz...");
        }

    }
    }
