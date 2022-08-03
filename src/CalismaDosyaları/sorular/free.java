package CalismaDosyaları.sorular;

import java.util.Scanner;

public class free {
    public static void main(String[] args) {
 Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
 String cumle=scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
 String kelime=scan.next();





        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1) {
            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmamis");
        }



    }
}
