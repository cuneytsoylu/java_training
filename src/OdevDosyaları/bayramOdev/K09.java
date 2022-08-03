package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K09 {
    public static void main(String[] args) {

        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1.dik kenarini giriniz");
        int dik1=scan.nextInt();
        System.out.println("Lutfen ucgenin 2.dik kenarini giriniz");
        int dik2=scan.nextInt();

        int hipo=(dik1*dik1)+(dik2*dik2);
       double sonuc=Math.sqrt(hipo);

        System.out.println("verilen ucgenin hipotenuz uzunlugu : "+sonuc);

    }
}
