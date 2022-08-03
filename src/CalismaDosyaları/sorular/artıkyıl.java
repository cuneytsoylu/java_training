package CalismaDosyaları.sorular;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gun=0;
        String  aylar= "Invalid";

        System.out.println("lutfen bir ay rakami giriniz: ");
        int ay = scan.nextInt();

        System.out.println("lutfen bir yil giriniz: ");
        int yil = scan.nextInt();

        switch (ay) {

            case 1:
                aylar = "January";
                gun = 31;
                break;
            case 2:
                aylar = "February";
                if ((yil % 400 == 0) || ((yil % 100 != 0) && (yil % 4 == 0))) {
                    gun = 29;
                    break;
                } else {
                    gun = 28;
                    break;
                }
            case 3:
                aylar = "March";
                gun = 31;
                break;
            case 4:
                aylar = "April";
                gun = 30;
                break;
            case 5:
                aylar = "May";
                gun = 31;
                break;
            case 6:
                aylar = "June";
                gun = 30;
                break;
            case 7:
                aylar= "July";
                gun = 31;
                break;
            case 8:
                aylar= "August";
                gun = 31;
                break;
            case 9:
                aylar = "September";
                gun = 30;
                break;
            case 10:
                aylar = "October";
                gun = 31;
                break;
            case 11:
                aylar = "November";
                gun = 30;
                break;
            case 12:
                aylar = "December";
                gun = 31;
                break;
        }
        System.out.println(yil+" yilinin "+ay+".ayinda "+gun+" gun vardir");
    }

}


