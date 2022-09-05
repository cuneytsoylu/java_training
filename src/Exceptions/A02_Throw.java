package Exceptions;

import java.util.Scanner;

public class A02_Throw {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        try{
            kanVer(yas);
        }catch (RuntimeException e){
            System.out.println("yasin ufak ama sagligin yerinde kan verebilirsin");
        }


    }

    private static void kanVer(int yas) {

        if (yas<18){
            throw new RuntimeException();
        }else {
            System.out.println("kan bagisi yapabilirsin");
        }

    }
}
