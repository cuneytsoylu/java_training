package OdevDosyaları.odev18temmuz;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {

        /*
        16----
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

    Test Data:
    java is fun

    Beklenen Çıktı:
    JAVA IS FUN
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kucuk harflerle bir cumle giriniz");
        String cumle=scan.nextLine();

        String sonuc=cumle.toUpperCase();
        System.out.println(sonuc);


    }
}
