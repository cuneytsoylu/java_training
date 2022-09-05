package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();


        mekanKontrol(yas);
        System.out.println("yasin tutmuyor ama dayin sagolsun gir bakalim...");

    }

    private static void mekanKontrol(int yas) throws IOException {


        if (yas<18){                                                                          //boyle bir durumda ben bir exception olusmasini istiyorum
            throw new IOException();    //unchecked exception                           // normalde boyle bir durumda exception olusmaz


        }else {
            System.out.println("Mekana hosgeldiniz...");
        }

    }


}

