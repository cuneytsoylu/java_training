package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adinizi  giriniz");
        String veri=scan.nextLine();
        System.out.println("lütfen memleketinizi giriniz");
        String veri1=scan.nextLine();
        System.out.println("lütfen su an ki konumunuzu giriniz ");
        String veri2=scan.nextLine();
        System.out.println("lütfen yasinizi giriniz");
        int veri3=scan.nextInt();
        System.out.println("lütfen boyunuzu giriniz");
        double veri4=scan.nextDouble();
        System.out.println("yasadınızı yeri seviyormusunuz true ya da false giriniz");
        boolean veri5=scan.nextBoolean();

         if(veri5==true){
             System.out.println(" adiniz: "+veri+" \nmemleketiniz: "+ veri1+" \nsu an ki konumunuz: "+veri2+"\nyasiniz: "+veri3+"\nboyunuz: "+veri4);
         }else System.out.println("yasadıgı yeri sevmeyen adamdan bir cacik olmaz");




























    }
}