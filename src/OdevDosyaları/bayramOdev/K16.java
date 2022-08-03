package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K16 {
    public static void main(String[] args) {


        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort
         * islemden biri ile isleme koyup sonucun yazdiriniz
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("lutfen yapılacak islemi giriniz : + ,- ,* ,/ ");
        String islem=scan.next();

        switch (islem){
            case "+" :
                System.out.println("girdiginiz sayilarin toplami : "+(sayi1+sayi2));
                break;
            case "-" :
                System.out.println("girdiginiz sayilarin farki : "+(sayi1-sayi2));
                break;
            case "*":
                System.out.println("girdiginiz sayilarin carpimi : "+(sayi1*sayi2));
                break;
                case "/":
                    System.out.println("girdiginiz sayilarin bolumu : "+(sayi1/sayi2));
                    break;
            default:
                System.out.println("gecersiz bir islem girdiniz");



        }




    }
}
