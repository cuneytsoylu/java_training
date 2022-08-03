package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D04 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
String input=scan.nextLine().toLowerCase();


        System.out.println(iceriyorMu(input));


    }

  public static boolean iceriyorMu(String input) {
        if (input.contains("xyz")){
           return true;
        }else
            return false;



    }
}
