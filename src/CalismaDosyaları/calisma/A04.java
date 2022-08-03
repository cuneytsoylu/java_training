package CalismaDosyaları.calisma;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kac gun sonrasi");
        int gun=scan.nextInt();
       gun=gun%7;

            switch (gun) {

                case 0:
                    System.out.println("pazartesi");
                    break;
                case 1:
                    System.out.println("sali");
                    break;
                case 2:
                    System.out.println("carsamba");
                    break;
                case 3:
                    System.out.println("persembe");
                    break;
                case 4:
                    System.out.println("cuma");
                    break;
                case 5:
                    System.out.println("cumartesi");
                    break;
                case 6:
                    System.out.println("pazar");
                    break;


            }

        }


    }

