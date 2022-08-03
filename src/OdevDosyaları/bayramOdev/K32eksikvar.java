package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K32eksikvar {
    public static void main(String[] args) {

        /*
         * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
         * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
         * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
         * harfi büyük yada küçüklüğüne duyarlıdır.)
         *
         * Sesli harfler: a,e,i,o,u
         *
         * Test Data: a
         *
         * Beklenen Çıktı: a harfi sesli harfdir.
         *
         * Test Data: d
         *
         * Beklenen Çıktı: d harfi sesiz harftir.
         *
         * Test Data: we yada %
         *
         * Beklenen Çıktı: Yanlis karakter girdiniz!
         *
         */


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
   String harf=scan.next().toLowerCase();

         if (harf.length()==1 || harf.contains("abcdefghijklmnoprstuwxyz")) {
    switch (harf) {

        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
            System.out.println(harf + " harfi  sesli harfdir");
            break;
        default:
            System.out.println(harf + " harfi sessiz harfdir");
    }

             } else if(harf.length()>1){
             System.out.println("yanlis karakter girdiniz");
}


    }
}
