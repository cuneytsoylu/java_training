package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir unvan giriniz");
        String jobtitle = scan.next();
        //   if (jobtitle.toLowerCase().equals("qa")){
        //       System.out.println("Quality Analyst");
//
        //  }else if ((jobtitle.toLowerCase().equals("dev"))){
        //      System.out.println("Developer");
        //  }else if ((jobtitle.toLowerCase().equals("ba"))){
        System.out.println("Business Analyst");
        // }else if ((jobtitle.toLowerCase().equals("pm"))){
        //     System.out.println("Project Manager");
        //}else System.out.println("lütfen gecerli biri degisken giriniz");


        switch (jobtitle.toLowerCase()) {
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("lutfen gecerli bir unvan giriniz");

        }


    }
}
