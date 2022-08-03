package CalismaDosyaları.sorular;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre=scan.nextLine();



        if((sifre.contains( " "))){
            System.out.println("sifre bosluk icermemeli");

        }else if (sifre.charAt(0)>'A' && sifre.charAt(0)<'Z') {
            System.out.println("sifre tamamlandı");

        }else if (sifre.charAt(sifre.length()-1)>'a' && sifre.charAt(sifre.length()-1)<'z') {
        System.out.println("sifre tamamlandı");
        }else if (sifre.length()>=8){
            System.out.println("sifre tamamlandı");

        }else System.out.println("islem basarisiz");







    }
}
