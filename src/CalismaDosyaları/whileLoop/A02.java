package CalismaDosyaları.whileLoop;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir sifre girmesini isteyin.
        //        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        // ve basarili sifre girinceye kadar tekrar tekrar sifre isteyiniz
        //        - Ilk harf buyuk harf olmali
        //        - Son harf kucuk harf olmali
        //        - Sifre bosluk icermemeli
        //        - Sifre uzunlugu en az 8 karakter olmali


        Scanner scan=new Scanner(System.in);
        String sifre="";
        int kontrol=0;
        boolean sifreBasariliMi=false;

        while (!sifreBasariliMi){
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();

            if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
                kontrol++;

            }else{
                System.out.println("Ilk harf buyuk olmali");
            }if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else{
                System.out.println("son harf kucuk harf olmali");
            }if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
            }else{
                kontrol++;
            }if (sifre.length()>=8){
                kontrol++;
            }else{
                System.out.println("sifre en az 8 karakter olmali");
            }
            if (kontrol==4) {
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            }
            else{
                    kontrol = 0;
                }


        }







        }

        }


