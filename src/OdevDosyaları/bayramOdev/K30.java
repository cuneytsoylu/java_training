package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K30 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();
        System.out.println("lutfen bir harf aliniz");
        char karakter = scan.next().toLowerCase().charAt(0);
int sayac=0;
        for (int i =0; i <kelime.length() ; i++) {
           if(karakter==kelime.charAt(i)){

               sayac++;
           }


        }
        System.out.println("girilen kelimede bulunan "+karakter+" harfi "+sayac+" adettir");


    }
}
