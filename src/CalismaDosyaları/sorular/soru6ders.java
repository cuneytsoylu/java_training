package CalismaDosyaları.sorular;

import java.util.Scanner;

public class soru6ders {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        String sifre=scan.nextLine();

        int kontrol=0;
         if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') {
             kontrol++;
         }else {
             System.out.println("ilk harf buyk olmali");

         } if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z') {
             kontrol++;
        }else {
            System.out.println("son harf kucuk olamli");
        }if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else{
             kontrol++;
        }if (sifre.length()>=8){
             kontrol++;
        }else {
            System.out.println("sifre en az 8 karakterli olmali");
        }if (kontrol==4){
            System.out.println("sifre basari ile kaydedildi");
        }else{
            System.out.println("islem basarisiz,Lutfen yeni bir sifre giriniz");
        }






    }
}
